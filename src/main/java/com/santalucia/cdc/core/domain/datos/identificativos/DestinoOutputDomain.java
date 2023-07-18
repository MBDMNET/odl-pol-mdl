package com.santalucia.cdc.core.domain.datos.identificativos;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * PolizaDeDestino
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DestinoOutputDomain {

	/** Codigo de tipo de destino*/
  private TipoMDLOuputDomain tipoDestinoPoliza ;
	/** Identificador unico de poliza de destino*/
	private String idPolizaDestino;
}
