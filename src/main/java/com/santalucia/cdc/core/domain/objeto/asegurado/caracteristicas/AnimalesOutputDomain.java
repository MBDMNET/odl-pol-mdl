package com.santalucia.cdc.core.domain.objeto.asegurado.caracteristicas;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Animales
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class AnimalesOutputDomain {

	/** Indicador Tipo de Especie Animal */
	private String indTipEspAnim;
	/** Codigo Raza Animal */
	private String codRazAnim;
	/** Indicador Tipo Identificacion Animal de Compania */
	private String indTipIdentAnimComp;
	/** Numero Identificacion Animal de Compania */
	private String numIdentAnimComp;
	/** Valor Edad */
	private String valEdad;

}
