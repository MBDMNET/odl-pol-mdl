package com.santalucia.cdc.core.service;

import com.santalucia.arq.ams.componentes.streaming.processor.HeadersValidationProcessor;
import com.santalucia.arq.ams.componentes.streaming.processor.SerdProcessor;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

/**
 * Interfaz del servicio de recepcion de mensajes
 *
 * @author Nfq
 *
 */
public interface PolicyMessageProcessorService {

  /**
   * Suscribir.
   *
   * Soporta tanto excepciones chequeadas como excepciones no chequeadas.
   *
   * @param processValidation
   * @param processSerd
   *
   * @return the consumer
   */
  Consumer<Message<byte[]>> process(HeadersValidationProcessor processValidation, SerdProcessor processSerd);

}
