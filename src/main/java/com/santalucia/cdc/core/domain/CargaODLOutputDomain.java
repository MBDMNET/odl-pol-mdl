package com.santalucia.cdc.core.domain;

import com.santalucia.cdc.core.domain.movimientos.ColMovimientoInputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.ColObjetoAseguradoInputDomain;
import com.santalucia.cdc.core.domain.polizas.PolizaInputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Objeto poliza
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class CargaODLOutputDomain {
  /**
   * Capacidad inicial por defecto
   */
  private static final int DEFAULT_CAPACITY = 10;

  private PolizaInputDomain polizaIndividual = new PolizaInputDomain();
  private List<ColObjetoAseguradoInputDomain> objetoAsegurado = new ArrayList<>(DEFAULT_CAPACITY);
  private ColMovimientoInputDomain movimientos = new ColMovimientoInputDomain();

}
