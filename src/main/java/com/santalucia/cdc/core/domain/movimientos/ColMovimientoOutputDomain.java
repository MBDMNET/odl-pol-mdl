package com.santalucia.cdc.core.domain.movimientos;

import com.santalucia.cdc.core.domain.metadata.MetadataOutputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Objeto Movimiento
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ColMovimientoOutputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Datos identificativos del movimiento */
	private DatosIdentificativosMovimientoOutputDomain datosIdentificativos = new DatosIdentificativosMovimientoOutputDomain();
	/** Ultimo Movimiento */
	private UltimoMovimientoOutputDomain ultimoMovimiento = new UltimoMovimientoOutputDomain();
	/** Historico Movimientos */
	private List<UltimoMovimientoOutputDomain> historicoMovimiento = new ArrayList<>(DEFAULT_CAPACITY);
	/** Metadata domain */
	private MetadataOutputDomain metadata = new MetadataOutputDomain();

}
