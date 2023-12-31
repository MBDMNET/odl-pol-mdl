package com.santalucia.cdc.core.domain.reaseguro;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ReaseguroCedidoProporcional
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ReaseguroCedidoProporcionalInputDomain {

	/** Identificador externo de la poliza */
	private String idExtPoliza;
	/** Codigo del identificador de reaseguro cedido proporcional */
	private String codIdentReasegCedProp;
	/** Fecha de efecto del reaseguro */
	private String fecEfectReaseg;
	/** Fecha de extincion del reaseguro */
	private String fecExtinReaseg;
	/** Fecha de liquidacion del reaseguro */
	private String fecLiqReaseg;
	/** Entidades*/
	private List<EntidadesInputDomain> entidades;

}
