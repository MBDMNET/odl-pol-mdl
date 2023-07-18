package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
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
public class DatosIdentificativosTarifOutputDomain {

	/**  categoria */
  private TipoMDLOuputDomain categoria;
	/** Tipo de complemento */
  private TipoMDLOuputDomain tipoComplemento;
	/** Numero de orden del complemento */
	private String numOrdComplem;
	/** Agrupación de garantías */
  private TipoMDLOuputDomain agrupGarantia;
	/** Numero de orden de agrupacion de garantia */
	private String numOrdenAgrupGarantia;
	/** Agrupacion de garantias-hogar */
	private String agrupGarantiaHog;
	/** Codigo de la garantia unitaria */
  private TipoMDLOuputDomain garantiaUnit;
	/** Numero de Orden Persona/Rol */
	private String numOrdenPersRol;
	/** Codigo del riesgo */
	private String codRiesgo;
	/** Denominacion del riesgo */
	private String descRiesgo;
	/** Edad de tarificacion */
	private String edadTarif;
  /** Porcentaje de Itinerario*/
  private String porcItinerario;
  /** Tasa de tarificación */
  private Double tasaTarifi;
}
