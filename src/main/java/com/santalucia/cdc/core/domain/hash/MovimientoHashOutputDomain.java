package com.santalucia.cdc.core.domain.hash;

import com.santalucia.cdc.core.domain.movimientos.DatosIdentificativosMovimientoOutputDomain;
import com.santalucia.cdc.core.domain.movimientos.UltimoMovimientoOutputDomain;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Dominio para la generacion del hash del objeto poliza.
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@AllArgsConstructor
public class MovimientoHashOutputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Datos identificativos del movimiento */
	DatosIdentificativosMovimientoOutputDomain datosIdentificativos;
	/** Ultimo Movimiento */
	UltimoMovimientoOutputDomain ultimoMovimiento;
	/** Historico Movimientos */
	List<UltimoMovimientoOutputDomain> historicoMovimiento;

	/**
	 * Constructor de clase
	 */
	public MovimientoHashOutputDomain() {
		datosIdentificativos = new DatosIdentificativosMovimientoOutputDomain();
		ultimoMovimiento = new UltimoMovimientoOutputDomain();
		historicoMovimiento = new ArrayList<>(DEFAULT_CAPACITY);
	}

}
