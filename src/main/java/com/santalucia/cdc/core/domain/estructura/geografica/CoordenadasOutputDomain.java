package com.santalucia.cdc.core.domain.estructura.geografica;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Coordenadas
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class CoordenadasOutputDomain {

	/** Sistema coordenadas*/
  private TipoMDLOuputDomain sistCoordenada;
	/** Tipo coordenada*/
  private TipoMDLOuputDomain codTipoCoord;
	/** Coordenada X*/
	private Double numCoordX;
	/** Coordenada Y */
	private Double numCoordY;

}
