package com.santalucia.cdc.core.domain.fechasestados;


import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

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
	/** Fecha prevista de la proxima reduccion*/
	private String fecPrevProxRed;
	/** Historico*/
	private List<HistoricoInputDomain> historico;

}
