package com.santalucia.cdc.core.domain.reaseguro;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Reaseguro
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ReaseguroOutputDomain {

	private String codIndReaseg;
	private String codIndCedProp;
	private String codIndAcept;
	private List<ReaseguroCedidoProporcionalOutputDomain> reaseguroCedidoProporcional;
	private ReaseguroAceptadoOutputDomain reaseguroAceptado;

}
