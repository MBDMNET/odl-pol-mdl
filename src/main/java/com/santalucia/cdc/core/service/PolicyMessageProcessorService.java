package com.santalucia.cdc.core.service;

import java.util.function.Consumer;

import org.springframework.messaging.Message;

import com.santalucia.arq.ams.componentes.streaming.processor.HeadersValidationProcessor;
import com.santalucia.arq.ams.componentes.streaming.processor.SerdProcessor;

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
