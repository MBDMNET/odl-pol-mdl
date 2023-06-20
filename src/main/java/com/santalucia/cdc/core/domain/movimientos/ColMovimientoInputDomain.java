package com.santalucia.cdc.core.domain.movimientos;

import java.util.ArrayList;
import java.util.List;

import com.santalucia.cdc.core.domain.metadata.MetadataInputDomain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Objeto Movimiento
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ColMovimientoInputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Datos identificativos del movimiento */
	private DatosIdentificativosMovimientoInputDomain datosIdentificativos = new DatosIdentificativosMovimientoInputDomain();
	/** Ultimo Movimiento */
	private UltimoMovimientoInputDomain ultimoMovimiento = new UltimoMovimientoInputDomain();
	/** Historico Movimientos */
	private List<UltimoMovimientoInputDomain> historicoMovimiento = new ArrayList<>(DEFAULT_CAPACITY);
	/** Metadata domain */
	private MetadataInputDomain metadata = new MetadataInputDomain();

}
