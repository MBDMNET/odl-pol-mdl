package com.santalucia.cdc.core.domain.objeto.asegurado.declaraciones;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Indicadores
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class IndicadoresOutputDomain {

	/** Clave del indicador */
	private String clavIndicador;
	/** Valor del indicador */
	private String valIndicador;

}
