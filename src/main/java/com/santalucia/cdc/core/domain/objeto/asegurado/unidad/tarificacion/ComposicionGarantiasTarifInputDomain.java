package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ComposicionGarantiasTarif
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ComposicionGarantiasTarifInputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Codigo de garantia */
	private String codGarantia;
	/** Descripcion de garantia */
	private String descGarantia;
	/** */
	private List<ComposicionSubgarantiasInputDomain> composicionSubgarantias = new ArrayList<>(DEFAULT_CAPACITY);

}
