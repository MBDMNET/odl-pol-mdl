package com.santalucia.cdc.core.domain.datos.cobro;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Objeto Datos Cobro
 *
 * @author Nfq
 *
 */

@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DatosMedioCobroOutputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Datos Cobro Bancario */
	private DatosCobroBancarioOutputDomain datosCobroBancario = new DatosCobroBancarioOutputDomain();

	/** Datos Cobro Fisico */
	private DatosCobroFisicoOutputDomain datosCobroFisico = new DatosCobroFisicoOutputDomain();

	/** Datos Cobro Interno */
	private DatosCobroInternoOutputDomain datosCobroInterno = new DatosCobroInternoOutputDomain();

	/** Lista Datos Cobro Otros Medios*/
	private List<DatosCobroOtrosMediosOutputDomain> datosCobroOtrosMedios = new ArrayList<>(DEFAULT_CAPACITY);

}
