package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ComposicionSubgarantias
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ComposicionSubgarantiasInputDomain {

	/** Codigo de subgarantia */
	private String codSubgarantia;
	/** Descripcion de subgarantia */
	private String descSubgarantia;

}
