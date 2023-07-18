package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * BonificacionesDescuentosTarif
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class BonificacionesDescuentosTarifOutputDomain {

	/** Bonificacion  a Nivel de Tarificacion */
  private TipoMDLOuputDomain bonificacion;
	/** Importe de Bonificacion o Descuento a Nivel de Tarificacion */
	private Double impBonificacion;
	/** Tasa de Bonificacion o Descuento a Nivel de Tarificacion */
	private String tasBonificacion;
	/** Tipo de Calculo de Bonificacion o Descuento a Nivel de Tarificacion */
	private String tipCalBonificacion;

}
