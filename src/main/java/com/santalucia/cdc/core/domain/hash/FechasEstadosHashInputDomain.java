package com.santalucia.cdc.core.domain.hash;

import com.santalucia.cdc.core.domain.fechasestados.EstadoInputDomain;

import lombok.Data;

/**
 * FechasYEstados
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
public class FechasEstadosHashInputDomain {

	/** Fecha */
	FechaHashInputDomain fechas;
	/** Estado*/
	EstadoInputDomain estados;

	/**
	 * Constructor de clase
	 */
	public FechasEstadosHashInputDomain() {
		fechas = new FechaHashInputDomain();
		estados = new EstadoInputDomain();
	}

}
