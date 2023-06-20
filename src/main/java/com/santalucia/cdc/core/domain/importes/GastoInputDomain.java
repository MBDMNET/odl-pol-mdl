package com.santalucia.cdc.core.domain.importes;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Gasto
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class GastoInputDomain {

	/** Codigo de Tipo de Gasto a Nivel de Poliza*/
	private String codTipoGasto;
	/** Denominacion de Tipo de Gasto a Nivel de Poliza*/
	private String descTipoGasto;
	/** Codigo de Gasto a Nivel de Poliza*/
	private String codGasto;
	/** Denominacion de Gasto a Nivel de Poliza*/
	private String descGasto;
	/** Importe de Gasto a Nivel de Poliza*/
	private Double impGasto;

}
