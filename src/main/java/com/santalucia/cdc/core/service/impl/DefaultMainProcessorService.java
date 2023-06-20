package com.santalucia.cdc.core.service.impl;


import com.santalucia.cdc.core.domain.polizas.PolizaInputDomain;
import org.springframework.stereotype.Service;
import com.santalucia.cdc.core.service.MainProcessorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

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
  public PolizaOutputDomain processMessage(PolizaInputDomain item) {
    log.info("Procesando el mensaje");

    return item;
  }

}
