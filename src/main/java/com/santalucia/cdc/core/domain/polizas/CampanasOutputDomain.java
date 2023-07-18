package com.santalucia.cdc.core.domain.polizas;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Objeto Campanas
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class CampanasOutputDomain {

	/** Campana comercial */
  private TipoMDLOuputDomain campComercial;
	/** Incentivo de la campana */
  private TipoMDLOuputDomain incentivoCamp;
	/** Indicador de caracteristicas del incentivo */
	private String indCaracIncent;
	/** Denominacion del indicador de caracteristicas del incentivo */
	private String descIndCaracIncent;
	/** Fecha de inicio de la campana */
	private String fecInicCamp;
	/** Fecha de fin de campana */
	private String fecFinVigencia;
	/** Duracion anos aplicacion de la campana */
	private String durAnnoApliCamp;
}
