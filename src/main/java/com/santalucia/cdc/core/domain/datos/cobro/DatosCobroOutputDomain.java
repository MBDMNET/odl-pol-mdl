package com.santalucia.cdc.core.domain.datos.cobro;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
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
public class DatosCobroOutputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Forma de cobro/pago */
  private TipoMDLOuputDomain formaPago;
  private TipoMDLOuputDomain medioCobroPago;
	/** Datos medio cobro */
	private DatosMedioCobroInputDomain datosMedioCobro = new DatosMedioCobroInputDomain();
	/** Datos Otros Cobros Pagos Bancarios */
	private List<DatosOtrosCobrosPagosBancariosInputDomain> datosOtrosCobrosPagosBancarios = new ArrayList<>(DEFAULT_CAPACITY);
}
