package com.santalucia.cdc.core.domain.estructura.geografica;

import lombok.Data;

/**
 * EstructuraGeografica
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
public class EstructuraGeograficaOutputDomain {

	/** Domicilio */
	DomicilioOutputDomain domicilio;

	/** Coordenadas*/
	CoordenadasOutputDomain coordenadas;

	/**
	 * Constructor de clase
	 */
	public EstructuraGeograficaOutputDomain() {
		coordenadas = new CoordenadasOutputDomain();
		domicilio = new DomicilioOutputDomain();
	}

}
