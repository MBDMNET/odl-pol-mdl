package com.santalucia.cdc.core.domain.objeto.asegurado;

import com.santalucia.cdc.core.domain.metadata.MetadataOutputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.caracteristicas.CaracteristicasOutputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.declaraciones.DeclaracionesExtraOutputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.declaraciones.DeclaracionesOutputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion.UnidadDeTarificacionOutputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Colleccion ObjetoAsegurado
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ColObjetoAseguradoOutputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	private DatosIdentificativosOAseguradoOutputDomain datosIdentificativosObjAseg = new DatosIdentificativosOAseguradoOutputDomain();
	private CaracteristicasOutputDomain caracteristicas = new CaracteristicasOutputDomain();
	private DeclaracionesOutputDomain declaraciones = new DeclaracionesOutputDomain();
	private DeclaracionesExtraOutputDomain declaracionesExtra = new DeclaracionesExtraOutputDomain();
	private List<UnidadDeTarificacionOutputDomain> unidadTarificacion = new ArrayList<>(DEFAULT_CAPACITY);
	private MetadataOutputDomain metadata = new MetadataOutputDomain();
}
