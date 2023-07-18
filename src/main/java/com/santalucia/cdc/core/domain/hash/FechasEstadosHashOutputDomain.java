package com.santalucia.cdc.core.domain.hash;


import com.santalucia.cdc.core.domain.fechasestados.EstadoOutputDomain;
import lombok.Data;

/**
 * FechasYEstados
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
public class FechasEstadosHashOutputDomain {

	/** Fecha */
	FechaHashOutputDomain fechas;
	/** Estado*/
	EstadoOutputDomain estados;

	/**
	 * Constructor de clase
	 */
	public FechasEstadosHashOutputDomain() {
		fechas = new FechaHashOutputDomain();
		estados = new EstadoOutputDomain();
	}

}
