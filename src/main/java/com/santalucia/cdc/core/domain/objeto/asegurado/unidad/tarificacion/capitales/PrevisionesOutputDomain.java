package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion.capitales;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Previsiones
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class PrevisionesOutputDomain {

	/** Ano del seguro */
	private Integer annoSeguro;
	/** Importe de capital */
	private Double impCapital;

}
