package com.santalucia.cdc.core.domain.importes;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
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
public class SobrePrimaOutputDomain {

	/** Sobreprima a Nivel de Poliza*/
  private TipoMDLOuputDomain sobreprima;
	/** Importe de Sobreprima a Nivel de Poliza*/
	private Double impSobreprima;

}
