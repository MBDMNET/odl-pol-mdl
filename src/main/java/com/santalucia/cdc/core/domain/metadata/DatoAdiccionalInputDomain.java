package com.santalucia.cdc.core.domain.metadata;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DatoAdiccional
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DatoAdiccionalInputDomain {

	/** Descripcion metadata*/
	private String descMetadata;

	/** Valor metadata*/
	private String valorMetadata;
}
