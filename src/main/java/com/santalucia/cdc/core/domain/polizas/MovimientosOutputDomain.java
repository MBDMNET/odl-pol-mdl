package com.santalucia.cdc.core.domain.polizas;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Movimientos
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class MovimientosOutputDomain {

	/** Numero de version de la poliza */
	private int versPolizaOrigen;
	/** Numero de version ODL de la poliza */
	private int versPolizaODL;
	/** Codigo del tipo de movimiento */
  private TipoMDLOuputDomain tipoMovimientoPoliza;
  /** estado del movimiento */
  private TipoMDLOuputDomain estadoMovimiento;
	/** Fecha de efecto del movimiento */
	private String fecInicMovim;
	/** Fecha de liquidacion del movimiento */
	private String fecLiqMovim;
	/** Numero de movimiento que genera la anulacion*/
	private String numMovimAnulac;
}
