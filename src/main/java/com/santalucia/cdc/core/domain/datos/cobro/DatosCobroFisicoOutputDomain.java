package com.santalucia.cdc.core.domain.datos.cobro;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * Objeto Datos Cobro
 *
 * @author Nfq
 *
 */

@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DatosCobroFisicoOutputDomain {

	/** Tipo de domicilio de cobro/pago */
  private TipoMDLOuputDomain tipoDomicilioCobro;
	/** pais */
  private TipoMDLOuputDomain pais;

	/** Codigo de provincia */
  private TipoMDLOuputDomain provincia;
	/** Localidad */
  private TipoMDLOuputDomain localidad;
	/** municipio */
  private TipoMDLOuputDomain municipio;
  /** Codigo Postal*/
  private TipoMDLOuputDomain codigoPostal;
	/** Codigo de entidad colectiva */
	private String codEntColectiva;
	/** Codigo de entidad singular */
	private String codEntSingular;
	/** Codigo de nucleo de poblacion */
	private String codNucPobla;
	/** Poblacion */
  private TipoMDLOuputDomain poblacion;
	/** Tipo de via */
  private TipoMDLOuputDomain tipoVia;
	/** Denominacion de domicilio */
	private String descDomicilio;
	/** Numero del domicilio */
	private Integer numDomicilio;
	/** Complemento del Numero del domicilio */
	private String compNumDomic;
	/** Bloque del domicilio */
	private String bloqueDomic;
	/** Portal del domicilio */
	private String portalDomic;
	/** Escalera del domicilio */
	private String escalDomic;
	/** Piso del domicilio */
	private String pisoDomic;
	/** Puerta del domicilio */
	private String puertaDomic;
	/** Otros datos de la direccion del domicilio */
	private String otrosDatosDomic;

}
