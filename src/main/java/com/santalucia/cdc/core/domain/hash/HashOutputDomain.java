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
public class HashOutputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Poliza individual */
	PolizaHashOutputDomain polizaIndividual;
	/** Objeto Asegurado */
	List<ObjetoAseguradoHashOutputDomain> objetoAsegurado;
	/** Movimientos */
	MovimientoHashOutputDomain movimientos;

	/**
	 * Constructor de clase
	 */
	public HashOutputDomain() {
		polizaIndividual = new PolizaHashOutputDomain();
		objetoAsegurado = new ArrayList<>(DEFAULT_CAPACITY);
		movimientos = new MovimientoHashOutputDomain();
	}

}
