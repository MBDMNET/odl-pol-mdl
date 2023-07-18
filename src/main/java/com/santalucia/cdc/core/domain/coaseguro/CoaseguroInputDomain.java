package com.santalucia.cdc.core.domain.coaseguro;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * CoaseguroDomain
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class CoaseguroInputDomain {

	/** Indicador de tipo de coaseguro */
	private String indTipCoaseguro;

	private List<DatosPropiosInputDomain> datosPropios;
}
