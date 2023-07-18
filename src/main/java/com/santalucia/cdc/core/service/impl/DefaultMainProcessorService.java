package com.santalucia.cdc.core.service.impl;


import com.santalucia.cdc.core.domain.CargaODLInputDomain;
import com.santalucia.cdc.core.domain.CargaODLOutputDomain;
import com.santalucia.cdc.core.service.MainProcessorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 * AppErrorCodes
 *
 * @author NFQ
 *
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class DefaultMainProcessorService implements MainProcessorService {


  @Override
  public CargaODLOutputDomain processMessage(CargaODLInputDomain item) {
    log.info("Procesando el mensaje");
    CargaODLOutputDomain result = new CargaODLOutputDomain();
    return result;
  }

}
