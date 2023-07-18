package com.santalucia.cdc.core.domain.fechasestados;


import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Historico
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class HistoricoOutputDomain {

	/** tipo del estado de la poliza*/
  private TipoMDLOuputDomain tipoEstadoPoliza;
	/** Fecha de estado de la poliza*/
	private String fecEstadoPol;
	/** Codigo de la causa del estado de la poliza*/
  private TipoMDLOuputDomain causaEstadoPoliza;
	/** Subestado de la poliza*/
  private TipoMDLOuputDomain subEstadoPoliza;
	/** Fecha de subestado de la poliza*/
	private String fecSubEstPol;
	/** Numero de orden de movimiento de estado/subestado*/
	private Integer numOrdenMovEst;

}
