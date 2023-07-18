package com.santalucia.cdc.core.domain.movimientos;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Ultimo Movimiento
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class UltimoMovimientoOutputDomain {

	/** Numero de version de la poliza */
	private int versPolizaOrigen;
	/** Numero de version ODL de la poliza */
	private int versPolizaODL;
	/** tipo de movimiento */
  private TipoMDLOuputDomain tipoMovimientoPoliza;
	/** estado del movimiento */
  private TipoMDLOuputDomain estadoMovimiento;
	private String fecInicMovim;
	/** Fecha de liquidacion del movimiento */
	private String fecLiqMovim;
	/** Numero de movimiento que genera la anulacion*/
	private String numMovimAnulac;
}
