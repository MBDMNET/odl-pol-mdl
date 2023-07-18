package com.santalucia.cdc.core.domain.importes;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * BonificacionYDescuento
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class BonificacionesDescuentosOutputDomain {

	/** Bonificacion y descuento*/
  private TipoMDLOuputDomain descuentos;
	/** Importe de bonificacion y descuento*/
	private Double impBonificacionDesc;

}
