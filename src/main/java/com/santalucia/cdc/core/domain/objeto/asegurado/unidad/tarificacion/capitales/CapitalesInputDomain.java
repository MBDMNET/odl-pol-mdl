package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion.capitales;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CapitalesDomain
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class CapitalesInputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Importe de capital a Nivel de tarificacion*/
	private Double impCapital;
	/** Importe de capital reducido*/
	private Double impCapitalRed;
	/** Importe de capital basico*/
	private Double impCapitalBasic;
	/** Porcentaje Incremento de Capital*/
	private String porcIncremCap;
	/** */
	private List<PrevisionesInputDomain> previsiones = new ArrayList<>(DEFAULT_CAPACITY);
}
