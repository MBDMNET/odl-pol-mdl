package com.santalucia.cdc.core.domain.fechasestados;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Estado
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class EstadoInputDomain {

	/** Indicador de la poliza formalizada */
	private String indPolFormalizada;
	/** Estado actual de la poliza */
	private String codTipoEstPolizaAct;
	/** Fecha estado actual de la poliza */
	private String fecEstadoPolAct;
	/** Fecha prevista de la proxima anulacion*/
	private String fecPrevProxAnul;
  /** Duración de la póliza */
  private String durPoliza;
  /** Tipo de duración de la póliza*/
  private String tipoDuracion;
	/** Fecha prevista de la proxima reduccion*/
	private String fecPrevProxRed;
	/** Historico*/
	private List<HistoricoInputDomain> historico;

}
