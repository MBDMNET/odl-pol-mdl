package com.santalucia.cdc.core.domain.importes;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NonNull;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/**
 * Importe
 *
 * @author Nfq
 *
 */
@Data
public class ImportesOutputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Codigo de moneda*/
  @Nullable
  TipoMDLOuputDomain moneda;
	/** Importe total recibo*/
  @Nullable
	Double impTotalRecibo;
  @NonNull
	/** Nivel de polizas*/
	List<NivelPolizaInputDomain> poliza;

	/**
	 * Constructor de clase
	 */
	public ImportesOutputDomain() {
		poliza = new ArrayList<>(DEFAULT_CAPACITY);
		impTotalRecibo = null;
		moneda = null;
	}

}
