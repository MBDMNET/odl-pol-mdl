package com.santalucia.cdc.core.domain.coaseguro;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * CoaseguroDomain
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class CoaseguroOutputDomain {

	/** Indicador de tipo de coaseguro */
  private TipoMDLOuputDomain tipoCoaseguro;

	private List<DatosPropiosOutputDomain> datosPropios;
}
