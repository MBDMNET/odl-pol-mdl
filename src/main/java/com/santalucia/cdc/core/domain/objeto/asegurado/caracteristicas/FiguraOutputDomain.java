package com.santalucia.cdc.core.domain.objeto.asegurado.caracteristicas;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Figura
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class FiguraOutputDomain {

	/** Numero de identificacion de persona */
	private String idPersona;
	/** Codigo de tipo de persona */
	private String codTipPersona;
	/** Denomiancion de tipo de persona */
	private String descTipPersona;
	/** Nombre de la persona */
	private String nombre;
	/** Primer apellido de la persona */
	private String primerApellido;
	/** Segundo apellido de la persona */
	private String segundoApellido;
	/** Razon social */
	private String razonSocial;
	/** Codigo de tipo de documento de identificacion */
	private String codTipDocumento;
	/** Denominacion de tipo de documento de identificacion */
	private String descTipDocumento;
	/** Numero de documento de identificacion */
	private String numDocumento;
	/** Fecha de nacimiento */
	private String fecNacimiento;
	/**Sexo de la persona */
  private TipoMDLOuputDomain sexo;
	/** Nacionalidades */
  private TipoMDLOuputDomain nacionalidades;


}
