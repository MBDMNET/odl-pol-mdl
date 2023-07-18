package com.santalucia.cdc.core.domain.polizas;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
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
public class DocumentosOutputDomain {

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
	/** Idioma del documento */
  private TipoMDLOuputDomain idiomaDocumento;
	/** Tamano del documento en kbytes */
	private String tamDocum;
}
