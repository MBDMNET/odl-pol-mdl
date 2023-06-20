package com.santalucia.cdc.core.domain.objeto.asegurado;

import java.util.ArrayList;
import java.util.List;

import com.santalucia.cdc.core.domain.metadata.MetadataInputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.caracteristicas.CaracteristicasInputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.declaraciones.DeclaracionesExtraInputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.declaraciones.DeclaracionesInputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion.UnidadDeTarificacionInputDomain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Colleccion ObjetoAsegurado
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ColObjetoAseguradoInputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	private DatosIdentificativosOAseguradoInputDomain datosIdentificativosObjAseg = new DatosIdentificativosOAseguradoInputDomain();
	private CaracteristicasInputDomain caracteristicas = new CaracteristicasInputDomain();
	private DeclaracionesInputDomain declaraciones = new DeclaracionesInputDomain();
	private DeclaracionesExtraInputDomain declaracionesExtra = new DeclaracionesExtraInputDomain();
	private List<UnidadDeTarificacionInputDomain> unidadTarificacion = new ArrayList<>(DEFAULT_CAPACITY);
	private MetadataInputDomain metadata = new MetadataInputDomain();
}
