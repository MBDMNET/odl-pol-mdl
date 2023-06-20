package com.santalucia.cdc.core.domain.polizas;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClausulasGDPR
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ClausulasGDPRInputDomain {

	/** Codigo de marca GDPR */
	private String codMarcaGDPR;
	/** Denominacion de marca GDPR */
	private String descMarcaGDPR;
	/** Valor de marca GDPR */
	private String valorMarcaGDPR;
	/** Valor de marca GDPR */
	private String fecMarcaGDPR;
}
