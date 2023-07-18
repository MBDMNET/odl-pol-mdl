package com.santalucia.cdc.core.domain.importes;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * RecargoEImpuesto
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class RecargosImpuestosOutputDomain {

	/** Codigo de Impuesto o Recargo a Nivel de Poliza*/
  private TipoMDLOuputDomain recargoImpuestos;

	/** Importe de Impuesto o Recargo a Nivel de Poliza*/
	private Double impRecargoImp;

}
