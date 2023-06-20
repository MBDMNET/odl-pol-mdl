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
public class EstructuraGeograficaInputDomain {

	/** Domicilio */
	DomicilioInputDomain domicilio;

	/** Coordenadas*/
	CoordenadasInputDomain coordenadas;

	/**
	 * Constructor de clase
	 */
	public EstructuraGeograficaInputDomain() {
		coordenadas = new CoordenadasInputDomain();
		domicilio = new DomicilioInputDomain();
	}

}
