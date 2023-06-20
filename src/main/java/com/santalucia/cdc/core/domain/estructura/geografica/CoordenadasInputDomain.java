package com.santalucia.cdc.core.domain.estructura.geografica;

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
public class CoordenadasInputDomain {

	/** Indice sistema coordenadas*/
	private String indSistCoord;
	/** Descripcion sistema coordenadas*/
	private String descSistCoord;
	/** Codigo tipo coordenada*/
	private String codTipoCoord;
	/** Descripcion tipo coordenada*/
	private String descTipoCoord;
	/** Coordenada X*/
	private Double numCoordX;
	/** Coordenada Y */
	private Double numCoordY;

}
