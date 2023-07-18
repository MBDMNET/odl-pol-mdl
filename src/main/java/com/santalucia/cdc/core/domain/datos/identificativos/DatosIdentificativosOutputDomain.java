package com.santalucia.cdc.core.domain.datos.identificativos;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
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
public class DatosIdentificativosOutputDomain {

	/** Identificador unico de la poliza*/
	private String idPolizaODL;
	/** Certificado de colectivos*/
	private String numCertificado;
	/** Codigo de tipo de poliza*/
  private TipoMDLOuputDomain tipoPoliza;
	/** Codigo de companyia de origen*/
  private TipoMDLOuputDomain companiaOrigen;
	/** Sistema de origen */
  private TipoMDLOuputDomain sistOrigenInfo;
	/** Codigo del sistema actual*/
  private TipoMDLOuputDomain sistActualInfo;
	/** Identificador de la poliza (interno aplicacion)*/
	private String idPolizaOrigen;
	/** Numero de poliza*/
	private String numPoliza;
	/** Codigo de colectivo */
	private String codColect;
	/** Denominacion del colectivo*/
	private String descColect;
  /** Indicador nivel de datos colectivos*/
  private String indNivDatColect;
  /** Indicador cobertura prestaciones*/
  private String indCobertPrest;
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
	/** Identificador de subcolectivo*/
	private String idSubcolectivo;
	/** Descripcion del subcolectivo*/
	private String descSubcolectivo;
	/** Tipo de comision*/
  private TipoMDLOuputDomain tipoComision;
	/** Polizas de procedencia*/
	private List<ProcedenciaOutputDomain> procedencia;
	/** Polizas de destino*/
	private List<DestinoOutputDomain> destino;
}
