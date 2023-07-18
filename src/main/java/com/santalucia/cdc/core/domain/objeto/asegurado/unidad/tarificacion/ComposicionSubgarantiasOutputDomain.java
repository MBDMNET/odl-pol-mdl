package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ComposicionSubgarantias
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ComposicionSubgarantiasOutputDomain {

	/** Codigo de subgarantia */
  private TipoMDLOuputDomain subgarantia;

}
