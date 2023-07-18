package com.santalucia.cdc.core.domain.fechasestados;

import lombok.Data;

/**
 * FechasYEstados
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
public class FechasEstadosOutputDomain {

	/** Fecha */
	FechaOutputDomain fechas;
	/** Estado*/
	EstadoOutputDomain estados;

	/**
	 * Constructor de clase
	 */
	public FechasEstadosOutputDomain() {
		fechas = new FechaOutputDomain();
		estados = new EstadoOutputDomain();
	}

}
