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
public class DatosCobroInputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Codigo de nivel de cobro/pago */
	private String codNivCobPag;
	/** Denominacion de nivel de cobro/pago */
	private String descNivCobPag;
	/** Indicador de la forma de cobro/pago */
	private String indFormCobPag;
	/** Denominacion de la forma de cobro/pago */
	private String descFormCobPag;
	/** Codigo de medio de cobro/pago */
	private String codMedCobPag;
	/** Denominacion del medio de cobro/pago*/
	private String descMedCobPag;
	/** Datos medio cobro */
	private DatosMedioCobroInputDomain datosMedioCobro = new DatosMedioCobroInputDomain();
	/** Datos Otros Cobros Pagos Bancarios */
	private List<DatosOtrosCobrosPagosBancariosInputDomain> datosOtrosCobrosPagosBancarios = new ArrayList<>(DEFAULT_CAPACITY);
}
