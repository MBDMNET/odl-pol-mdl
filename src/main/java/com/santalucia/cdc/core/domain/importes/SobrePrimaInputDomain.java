package com.santalucia.cdc.core.domain.importes;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * SobrePrima
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class SobrePrimaInputDomain {

	/** Codigo de Sobreprima a Nivel de Poliza*/
	private String codSobreprima;
	/** Denominacion de Sobreprima a Nivel de Poliza*/
	private String descSobreprima;
	/** Importe de Sobreprima a Nivel de Poliza*/
	private Double impSobreprima;

}
