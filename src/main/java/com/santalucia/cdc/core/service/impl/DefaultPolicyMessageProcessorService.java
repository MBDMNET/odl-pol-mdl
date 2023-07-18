package com.santalucia.cdc.core.service.impl;

import com.santalucia.arq.ams.componentes.streaming.processor.HeadersValidationProcessor;
import com.santalucia.arq.ams.componentes.streaming.processor.SerdProcessor;
import com.santalucia.cdc.core.domain.CargaODLInputDomain;
import com.santalucia.cdc.core.domain.CargaODLOutputDomain;
import com.santalucia.cdc.core.mappers.PolicyInputMapper;
import com.santalucia.cdc.core.mappers.PolicyOutputMapper;
import com.santalucia.cdc.core.service.MainProcessorService;
import com.santalucia.cdc.core.service.PolicyMessageProcessorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import neg.sl.cartera.polizas_odl.carga.value.CargaODLValue;
import neg.sl.cartera.polizas_odl.mdl.value.EventosCompletosValue;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Implementacion del servicio que recibe mensajes con Siniestros
 *
 * @author Nfq
 *
 */
@Slf4j
@Service
@AllArgsConstructor
public class DefaultPolicyMessageProcessorService implements PolicyMessageProcessorService {

  private static final long FIRST_OFFSET = 0L;
  private static final String HEADER_KAFKA_OFFSET = "kafka_offset";

  // Topics de salida
  private static final String OUTBOUND_CHANNEL = "process-out-0";
  private static final String DLQ_CHANNEL = "process-out-1";
  // Cabeceras DLT
  private static final String DLT_EXCEPTION_FQCN = "x-exception-fqcn";
  private static final String DLT_EXCEPTION_MESSAGE = "x-exception-message";
  private static final String DLT_EXCEPTION_STACKTRACE = "x-exception-stacktrace";
  private static final String DLT_ORIGINAL_TOPIC = "x-original-topic";

  // Autowired
  private StreamBridge streamBridge;
  private MainProcessorService mainProcessorService;
  private final PolicyInputMapper inputDomainMapper;
  private final PolicyOutputMapper outputDomainMapper;

  //private ClaimKafkaDomainMapper domainMapper;

  /**
   * Suscribir.
   *
   * Soporta tanto excepciones chequeadas como excepciones no chequeadas.
   * @param processValidation
   * @param processSerd
   * @return the consumer
   */
  @Bean(name = "process")
  @Override
  public Consumer<Message<byte[]>> process(HeadersValidationProcessor processValidation, SerdProcessor processSerd) {

    return message -> {
      long offset = FIRST_OFFSET;

      log.debug("RECIBIDO - KafkaBindingsConfig.procesar, inbound mensaje {}", message);
      String objetoEntrada = new String(message.getPayload(), StandardCharsets.UTF_8);

      //de AVRO evwntoCompletos a CargaODLInputDomai
      // de CargaODLInputDomain a CargaODLOutDomain
      // de CargaODLOutputDomain a cargaValue del avro

      // Proceso de validacion de cabeceras.
      processValidation.process(message.getHeaders());
      // Proceso de deserializacion avro y gestion cabeceras cloudevents, jwt
      Message<EventosCompletosValue> messageCE = processSerd.deserializer(message, EventosCompletosValue.class, Boolean.FALSE);
      CargaODLOutputDomain cargaODLOutputDomain =  mainProcessorService.processMessage(inputDomainMapper.toInputDomain(messageCE.getPayload()));
      //mapeo de polizaOutputDomain a cargaValue
      CargaODLValue result = outputDomainMapper.toOutputResource(cargaODLOutputDomain);
      // Proceso de serializacion avr
      Message<byte[]> producedMessage =  processSerd.serializer(new GenericMessage<>(result, message.getHeaders()), Boolean.TRUE);
      streamBridge.send(OUTBOUND_CHANNEL,producedMessage);
      log.debug("Evento publicado en topic de salida: {}", message);
    };
  }

  /**
   * Send to DQL
   *
   */
  private void sendToDLQ(Message<byte[]> message, Exception e) {
    Map<String, Object> copyHeaders = message.getHeaders().entrySet().stream().parallel()
      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    // Add headers x-original-topic, x-exception-message, and x-exception-stacktrace
    copyHeaders.put(DLT_EXCEPTION_FQCN, e.getClass().toString().getBytes());
    String messageException = e.getMessage();
    if (messageException != null) {
      copyHeaders.put(DLT_EXCEPTION_MESSAGE, messageException.getBytes());
    }
    copyHeaders.put(DLT_EXCEPTION_STACKTRACE, ExceptionUtils.getStackTrace(e).getBytes());

    Optional.of(copyHeaders).map(h -> h.get(KafkaHeaders.RECEIVED_TOPIC)).map(Object::toString)
      .ifPresent(topic -> copyHeaders.put(DLT_ORIGINAL_TOPIC, topic.getBytes()));

    // Envio de respuesta a kafka.
    streamBridge.send(DLQ_CHANNEL,
      MessageBuilder.withPayload(message.getPayload()).copyHeaders(copyHeaders).build());
    log.error("Registro enviado a DLQ: {}. Ex: {}", message, e.getClass().toString());
  }
}
