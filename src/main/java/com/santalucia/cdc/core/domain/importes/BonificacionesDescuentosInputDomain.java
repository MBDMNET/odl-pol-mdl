package com.santalucia.cdc.core.domain.importes;

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
public class BonificacionesDescuentosInputDomain {

	/** Codigo de bonificacion y descuento*/
	private String codBonificacionDesc;
	/** Descripcion de bonificacion y descuento*/
	private String descBonificacionDesc;
	/** Importe de bonificacion y descuento*/
	private Double impBonificacionDesc;

}
