package com.santalucia.cdc.core.domain.figuras;


import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DatoPersonal
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DatoPersonalInputDomain {

	/** Codigo del tipo de rol */
	private String codTipoRol;
	/** Denominacion del tipo de rol */
	private String descTipoRol;
	/** Numero de orden de rol */
	private Integer numOrdRol;
	/** Numero de identificacion de persona */
	private String idPersona;
	/** Codigo de tipo de persona */
	private String codTipoPersona;
	/** Denomiancion de tipo de persona */
	private String descTipoPersona;
  /** Fecha de alta*/
  private String fecAlta;
	/** Nombre de la persona */
	private String nombre;
	/** Primer apellido de la persona */
	private String primerApellido;
	/** Segundo apellido de la persona */
	private String segundoApellido;
	/** Razon social */
	private String razonSocial;
	/** Codigo de tipo de documento de identificacion */
	private String codTipoDocumento;
	/** Denominacion de tipo de documento de identificacion */
	private String descTipoDocumento;
	/** Numero de documento de identificacion */
	private String numDocumento;
	/** Fecha de nacimiento */
	private String fecNacimiento;
	/** Indicador de sexo de la persona */
	private String codSexo;
	/** Denominacion de sexo de la persona */
	private String descSexo;
	/** Fecha de nacimiento calculada*/
	private String fecNacCalculada;
	/** Codigo del beneficiario*/
	private String codBenefic;
	/** Descripcion del beneficiario*/
	private String descBenefic;
	/** Texto libre*/
	private String textoLibre;
  /**  Dependencia de la ficgura*/
  private DependenciaFiguraDomain dependenciaFigura;
}
