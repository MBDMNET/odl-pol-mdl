package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UnidadDeTarificacion
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DatosPropiosTarifInputDomain {

	/** Codigo de ramo contable */
	private String codRamContable;
	/** Denominacion de ramo contable */
	private String descRamContable;
	/** Codigo de modalidad contable */
	private String codModContable;
	/** Denominacion de modalidad contable*/
	private String descModContable;
  /** Código de Itinerario */
  private String codItinerario;
  /** Descripción de itinerario */
  private String descItinerario;

}
