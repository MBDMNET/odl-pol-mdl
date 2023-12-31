package com.santalucia.cdc.core.domain.figuras;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Figura
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class FigurasInputDomain {

	/** Sector de actividad del colectivo*/
	private String codSectorColect;
	/** Descripcion del sector de actividad del colectivo*/
	private String descSectorColect;
	/** Numero de personas del colectivo*/
	private String numPersColect;
	/** Numero de telefono del colectivo*/
	private String numTelefColect;
	/** Datos personales*/
	private List<DatoPersonalInputDomain> datosPersonales;

}
