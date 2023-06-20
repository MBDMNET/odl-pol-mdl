package com.santalucia.cdc.core.domain.figuras;

import java.util.List;

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
