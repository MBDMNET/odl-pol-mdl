package com.santalucia.cdc.core.domain.reaseguro;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Reaseguro
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ReaseguroInputDomain {

	private String codIndReaseg;
	private String codIndCedProp;
	private String codIndAcept;
	private List<ReaseguroCedidoProporcionalInputDomain> reaseguroCedidoProporcional;
	private ReaseguroAceptadoInputDomain reaseguroAceptado;

}
