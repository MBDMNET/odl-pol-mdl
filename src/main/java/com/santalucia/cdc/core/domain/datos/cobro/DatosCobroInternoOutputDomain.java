package com.santalucia.cdc.core.domain.datos.cobro;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * Objeto Datos Cobro
 *
 * @author Nfq
 *
 */

@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DatosCobroInternoOutputDomain {

	/** Cobro interno compañía */
  private TipoMDLOuputDomain cobroInterno;
}
