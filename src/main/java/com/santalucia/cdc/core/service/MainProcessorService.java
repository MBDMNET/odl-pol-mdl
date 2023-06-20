package com.santalucia.cdc.core.service;

import com.santalucia.cdc.core.domain.polizas.PolizaInputDomain;
import neg.sl.cartera.polizas_odl.mdl.value.EventosCompletosValue;
import org.springframework.messaging.Message;
import com.santalucia.arq.ams.componentes.streaming.processor.SerdProcessor;

/**
 * Servicio de obtencion de datos persistidos multiramo
 *
 * @author Nfq
 *
 */
public interface MainProcessorService {

  /**
   * Metodo para procesar el mensaje de entrada
   */
  public PolizaOutputDomain processMessage(PolizaInputDomain item);
}
