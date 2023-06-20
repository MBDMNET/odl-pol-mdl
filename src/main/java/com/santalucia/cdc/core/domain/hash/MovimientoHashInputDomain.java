package com.santalucia.cdc.core.domain.hash;

import java.util.ArrayList;
import java.util.List;

import com.santalucia.cdc.core.domain.movimientos.DatosIdentificativosMovimientoInputDomain;
import com.santalucia.cdc.core.domain.movimientos.UltimoMovimientoInputDomain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Dominio para la generacion del hash del objeto poliza.
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@AllArgsConstructor
public class MovimientoHashInputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Datos identificativos del movimiento */
	DatosIdentificativosMovimientoInputDomain datosIdentificativos;
	/** Ultimo Movimiento */
	UltimoMovimientoInputDomain ultimoMovimiento;
	/** Historico Movimientos */
	List<UltimoMovimientoInputDomain> historicoMovimiento;

	/**
	 * Constructor de clase
	 */
	public MovimientoHashInputDomain() {
		datosIdentificativos = new DatosIdentificativosMovimientoInputDomain();
		ultimoMovimiento = new UltimoMovimientoInputDomain();
		historicoMovimiento = new ArrayList<>(DEFAULT_CAPACITY);
	}

}
