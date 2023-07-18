package com.santalucia.cdc.core.domain.datos.identificativos;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * PolizaDeProcedencia
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ProcedenciaOutputDomain {

	/** Tipo de procedencia */
  private TipoMDLOuputDomain tipoProcedenciaPoliza;
	/** Identificador unico de poliza de procedencia*/
	private String idPolizaProced;
}
