package com.santalucia.cdc.core.domain.hash;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Dominio para la generacion del hash del objeto poliza.
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@AllArgsConstructor
public class HashInputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Poliza individual */
	PolizaHashInputDomain polizaIndividual;
	/** Objeto Asegurado */
	List<ObjetoAseguradoHashInputDomain> objetoAsegurado;
	/** Movimientos */
	MovimientoHashInputDomain movimientos;

	/**
	 * Constructor de clase
	 */
	public HashInputDomain() {
		polizaIndividual = new PolizaHashInputDomain();
		objetoAsegurado = new ArrayList<>(DEFAULT_CAPACITY);
		movimientos = new MovimientoHashInputDomain();
	}

}
