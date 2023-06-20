package com.santalucia.cdc.core.domain.reaseguro;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Reaseguro Aceptado
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ReaseguroAceptadoInputDomain {

	/** Identificador externo de la poliza  */
	private String idExtPoliza;
}
