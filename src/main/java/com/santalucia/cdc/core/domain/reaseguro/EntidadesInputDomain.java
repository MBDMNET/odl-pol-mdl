package com.santalucia.cdc.core.domain.reaseguro;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidades
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class EntidadesInputDomain {

	/** Codigo de identificador del reasegurador*/
	private String codIdenReaseg;
	/** Denominacion del reasegurador */
	private String descReaseg;
	/** Porcentaje de particion */
	private String porPartReaseg;
}
