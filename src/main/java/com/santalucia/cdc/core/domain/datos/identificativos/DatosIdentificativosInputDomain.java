package com.santalucia.cdc.core.domain.datos.identificativos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DatoIdentificativo
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DatosIdentificativosInputDomain {

	/** Identificador unico de la poliza*/
	private String idPolizaODL;
	/** Certificado de colectivos*/
	private String numCertificado;
	/** Codigo de tipo de poliza*/
	private String codTipoPoliza;
	/** Denominacion del tipo de poliza*/
	private String descTipoPoliza;
	/** Codigo de companyia de origen*/
	private String codCiaOrigen;
	/** Denominacion de companyia de origen*/
	private String descCiaOrigen;
	/** Codigo del sistema de origen */
	private String codSistOrigen;
	/** Denominacion del sistema de origen*/
	private String descSistOrigen;
	/** Codigo del sistema actual*/
	private String codSistActual;
	/** Denominacion del sistema actual*/
	private String descSistActual;
	/** Identificador de la poliza (interno aplicacion)*/
	private String idPolizaOrigen;
	/** Numero de poliza*/
	private String numPoliza;
	/** Codigo de colectivo */
	private String codColect;
	/** Denominacion del colectivo*/
	private String descColect;
	/** Codigo de tipo de contrato*/
	private String codTipoContr;
	/** Denominacion de tipo de contrato*/
	private String descTipoContr;
	/** Numero de agrupacion de polizas (pack comercial)*/
	private String numPackPoliza;
	/** Numero de paquete*/
	private String numPaquete;
	/** Numero de identificacion de presupuesto*/
	private String numIdPresupuesto;
  /** Número que identifica/agrupa a una cantidad de presupuestos que provienen de una misma necesidad*/
  private String numIdAgrupacion;
  /** Indicador nivel de datos colectivos*/
  private String indNivDatColect;
  /** Indicador cobertura prestaciones*/
  private String indCobertPrest;
	/** Identificador de subcolectivo*/
	private String idSubcolectivo;
	/** Descripcion del subcolectivo*/
	private String descSubcolectivo;
	/** Identificador del tipo de comision*/
	private String codTipComision;
	/** Descripcion del tipo de comision*/
	private String descTipComision;
	/** Polizas de procedencia*/
	private List<ProcedenciaInputDomain> procedencia;
	/** Polizas de destino*/
	private List<DestinoInputDomain> destino;
}
