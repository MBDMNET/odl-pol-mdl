package com.santalucia.cdc.core.domain.datos.cobro;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

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
public class DatosMedioCobroInputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Datos Cobro Bancario */
	private DatosCobroBancarioInputDomain datosCobroBancario = new DatosCobroBancarioInputDomain();

	/** Datos Cobro Fisico */
	private DatosCobroFisicoDomain datosCobroFisico = new DatosCobroFisicoDomain();

	/** Datos Cobro Interno */
	private DatosCobroInternoInputDomain datosCobroInterno = new DatosCobroInternoInputDomain();

	/** Lista Datos Cobro Otros Medios*/
	private List<DatosCobroOtrosMediosInputDomain> datosCobroOtrosMedios = new ArrayList<>(DEFAULT_CAPACITY);

}
