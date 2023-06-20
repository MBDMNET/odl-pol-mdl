package com.santalucia.cdc.core.domain.polizas;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Subcolectivo
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class SubColectivosInputDomain {

	/** Id objeto asegurado*/
	private String idObjAsegODL;
	/** Codigo de subcolectivo */
	private String codSubcolect;
	/** Denominacion del subcolectivo*/
	private String descSubcolect;
	/** Numero de personas del subcolectivo*/
	private String numPersSubcolect;
	/** Numero de telefono del subcolectivo*/
	private String numTelefSubcolect;
}
