package com.santalucia.cdc.core.domain.datos.cobro;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
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
public class DatosCobroOtrosMediosOutputDomain {

	/** Datos de medio de cobro/pago */
  private TipoMDLOuputDomain datosMedioCobro;
	/** Valor de datos de medio de cobro/pago */
	private String valorDatosMedCob;

}
