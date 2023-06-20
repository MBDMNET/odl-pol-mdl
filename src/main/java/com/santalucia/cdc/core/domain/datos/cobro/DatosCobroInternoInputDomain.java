package com.santalucia.cdc.core.domain.datos.cobro;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * Objeto Datos Cobro
 *
 * @author Nfq
 *
 */

@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DatosCobroInternoInputDomain {

	/** Codigo cobro/pago interno compania */
	private String codCobroInterno;
	/** Denominacion cobro/pago interno compania */
	private String descCobroInterno;
}
