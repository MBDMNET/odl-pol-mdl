package com.santalucia.cdc.core.domain.importes;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NonNull;

import javax.annotation.Nullable;

/**
 * Importe
 *
 * @author Nfq
 *
 */
@Data
public class ImportesInputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Codigo de moneda*/
  @Nullable
	String codMoneda;
	/** Importe total recibo*/
  @Nullable
	Double impTotalRecibo;
  @NonNull
	/** Nivel de polizas*/
	List<NivelPolizaInputDomain> poliza;

	/**
	 * Constructor de clase
	 */
	public ImportesInputDomain() {
		poliza = new ArrayList<>(DEFAULT_CAPACITY);
		impTotalRecibo = null;
		codMoneda = null;
	}

}
