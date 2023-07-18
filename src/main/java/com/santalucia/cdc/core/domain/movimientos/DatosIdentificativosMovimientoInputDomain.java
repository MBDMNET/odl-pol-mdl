package com.santalucia.cdc.core.domain.movimientos;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Datos Identificativos Movimiento
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DatosIdentificativosMovimientoInputDomain {

	/** Identificador de la poliza ODL */
	private String idPolizaODL;
	/** Identificador de la poliza origen */
	private String idPolizaOrigen;
  /** Fecha de inicio validez de los datos de cobro sobre la póliza */
  private String fechaInicioValidez;
  /** Fecha de fin de validez de los datos de cobro sobre la póliza */
  private String fechaFinValidez;
	/** Numero de certificado */
	private String numCertificado;
	/** Codigo de tipo de poliza */
	private String codTipPoliza;

}
