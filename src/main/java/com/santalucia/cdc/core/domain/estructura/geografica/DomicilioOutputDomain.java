package com.santalucia.cdc.core.domain.estructura.geografica;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DomicilioDomain
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DomicilioOutputDomain {

	/** pais*/
  private TipoMDLOuputDomain pais;
	/** Codigo de provincia*/
  private TipoMDLOuputDomain provincia;;
	/** Localidad*/
  private TipoMDLOuputDomain localidad;
	/**  municipio*/
  private TipoMDLOuputDomain municipio;
	/** Codigo de entidad colectiva*/
	private String codEntColectiva;
	/** Codigo de entidad singular*/
	private String codEntSingular;
	/** Codigo de nucleo de poblacion*/
	private String codNucPobla;
	/** Poblacion*/
  private TipoMDLOuputDomain poblacion;
	/** Codigo Postal*/
	private TipoMDLOuputDomain codigoPostal;
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
	/** Otros datos domicilio **/
	private String otrosDatosDomic;
}
