package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * ComposicionGarantiasTarif
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ComposicionGarantiasTarifOutputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Codigo de garantia */
  private TipoMDLOuputDomain garantia;
	/** */
	private List<ComposicionSubgarantiasInputDomain> composicionSubgarantias = new ArrayList<>(DEFAULT_CAPACITY);
  private List<ComposicionServiciosDomain> composicionServicios = new ArrayList<>(DEFAULT_CAPACITY);



}
