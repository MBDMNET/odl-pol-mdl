package com.santalucia.cdc.core.domain.objeto.asegurado.caracteristicas;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DisposicionesElectronicas
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DisposicionesElectronicasInputDomain {

	/** Codigo Marca de Dispositivo Electronico */
	private String codMarcDispElect;
	/** Codigo Modelo de Dispositivo Electronico */
	private String codModDispElect;
	/** Codigo Identificador Dispositivo Electronico */
	private String codIdentDispElect;

}
