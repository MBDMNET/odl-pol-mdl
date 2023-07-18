package com.santalucia.cdc.core.domain.importes;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
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
public class GastoOutputDomain {

	/**Tipo de Gasto a Nivel de Poliza*/
  private TipoMDLOuputDomain tipoGasto;
	/** Gasto a Nivel de Poliza*/
  private TipoMDLOuputDomain gasto;
	/** Importe de Gasto a Nivel de Poliza*/
	private Double impGasto;

}
