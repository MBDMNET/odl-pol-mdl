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
public class DatosCobroOtrosMediosInputDomain {

	/** Codigo de clave de datos de medio de cobro/pago */
	private String codDatosMedCob;
	/** Denominacion de clave de datos de medio de cobro/pago */
	private String descDatosMedCob;
	/** Valor de datos de medio de cobro/pago */
	private String valorDatosMedCob;

}
