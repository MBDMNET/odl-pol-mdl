package com.santalucia.cdc.core.domain.polizas;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Objeto Documentos
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DocumentosInputDomain {

	/** Identificador de documento */
	private String idDocum;
	/** Codigo de tipo de documento */
	private String codTipDocum;
	/** Denominacion de tipo de documento */
	private String descTipDocum;
	/** Fecha de efecto del documento */
	private String fecEfectoDocum;
	/** Titulo del documento */
	private String tituloDocum;
	/** Codigo de idioma del documento */
	private String codIdiomDocum;
	/** Denominacion del idioma del documento */
	private String descIdiomDocum;
	/** Tamano del documento en kbytes */
	private String tamDocum;
}
