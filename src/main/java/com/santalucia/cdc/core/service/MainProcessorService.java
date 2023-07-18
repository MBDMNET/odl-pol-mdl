package com.santalucia.cdc.core.service;

import com.santalucia.cdc.core.domain.CargaODLInputDomain;
import com.santalucia.cdc.core.domain.CargaODLOutputDomain;

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
  public CargaODLOutputDomain processMessage(CargaODLInputDomain item);
}
