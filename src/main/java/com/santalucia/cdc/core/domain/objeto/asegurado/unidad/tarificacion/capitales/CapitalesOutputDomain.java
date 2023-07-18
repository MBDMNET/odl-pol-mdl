package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion.capitales;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * CapitalesDomain
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class CapitalesOutputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Importe de capital a Nivel de tarificacion*/
	private Double impCapital;
	/** Importe de capital reducido*/
	private Double impCapitalRed;
	/** Importe de capital basico*/
	private Double impCapitalBasic;
	/** Porcentaje Incremento de Capital*/
	private String porcIncremCap;

  /** Importe de tramitación de siniestros */
  private Double impCapitalTramSin;
  /** Importe de traslado mutualizado */
  private Double impCapitalTrasMut;
  /** Importe de capital natural*/
  private Double impCapitalNat;
  /** Importe de capital nivelado*/
  private Double impCapitalNiv;
  /** Importe de capital consolidado */
  private Double impCapitalCons;


	/** */
	private List<PrevisionesOutputDomain> previsiones = new ArrayList<>(DEFAULT_CAPACITY);
}
