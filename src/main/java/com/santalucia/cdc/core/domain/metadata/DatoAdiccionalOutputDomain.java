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
public class DatoAdiccionalOutputDomain {

	/** Descripcion metadata*/
	private String descMetadata;

	/** Valor metadata*/
	private String valorMetadata;
}
