package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * PrimasTarif
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class PrimasTarifOutputDomain {

	/** Importe de Prima de Tarifa a Nivel de tarificacion */
	private Double impPrimaTarifa;
	/** Importe de Prima de tarifa Bruta a Nivel de tarificacion*/
	private Double impPrimaBruta;
	/** Importe de prima no consumida*/
	private Double impPrimaNoCons;
  /** Importe de prima natural */
  private Double impPrimaNat;
  /** Importe de prima nivelada */
  private Double impPrimCons;
}
