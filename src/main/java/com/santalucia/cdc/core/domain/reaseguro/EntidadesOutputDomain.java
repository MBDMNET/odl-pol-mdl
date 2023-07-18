package com.santalucia.cdc.core.domain.reaseguro;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidades
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class EntidadesOutputDomain {

	/** Codigo de identificador del reasegurador*/
  private TipoMDLOuputDomain entidad;
	/** Porcentaje de particion */
	private String porPartReaseg;
}
