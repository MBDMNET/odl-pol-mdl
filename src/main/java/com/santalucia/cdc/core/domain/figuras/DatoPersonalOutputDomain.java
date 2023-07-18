package com.santalucia.cdc.core.domain.figuras;


import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
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
public class DatoPersonalOutputDomain {

	/** Codigo del tipo de rol */
  private TipoMDLOuputDomain tipoRol;
	/** Numero de orden de rol */
	private Integer numOrdRol;
	/** Numero de identificacion de persona */
	private String idPersona;
	/** Tipo de persona */
  private TipoMDLOuputDomain tipoPersona;
	/** Nombre de la persona */
	private String nombre;
	/** Primer apellido de la persona */
	private String primerApellido;
	/** Segundo apellido de la persona */
	private String segundoApellido;
	/** Razon social */
	private String razonSocial;
	/** Tipo de documento de identificacion */
  private TipoMDLOuputDomain tipoDocumentoAcreditativo;
	/** Numero de documento de identificacion */
	private String numDocumento;
	/** Fecha de nacimiento */
	private String fecNacimiento;
	/** sexo de la persona */
  private TipoMDLOuputDomain sexo;;
	/** Fecha de nacimiento calculada*/
	private String fecNacCalculada;
  /** Fecha de alta*/
  private String fecAlta;
	/** Codigo del beneficiario*/
	private String codBenefic;
	/** Descripcion del beneficiario*/
	private String descBenefic;
	/** Texto libre*/
	private String textoLibre;
  /**  Dependencia de la ficgura*/
  private DependenciaFiguraDomain dependenciaFigura;
}
