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
public class FechasEstadosInputDomain {

	/** Fecha */
	FechaInputDomain fechas;
	/** Estado*/
	EstadoInputDomain estados;

	/**
	 * Constructor de clase
	 */
	public FechasEstadosInputDomain() {
		fechas = new FechaInputDomain();
		estados = new EstadoInputDomain();
	}

}
