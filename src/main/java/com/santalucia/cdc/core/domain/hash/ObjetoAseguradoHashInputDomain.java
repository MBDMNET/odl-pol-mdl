package com.santalucia.cdc.core.domain.hash;

import com.santalucia.cdc.core.domain.objeto.asegurado.DatosIdentificativosOAseguradoInputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.caracteristicas.CaracteristicasInputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.declaraciones.DeclaracionesExtraInputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.declaraciones.DeclaracionesInputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion.UnidadDeTarificacionInputDomain;
import lombok.AllArgsConstructor;
import lombok.Data;

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
@AllArgsConstructor
public class ObjetoAseguradoHashInputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	DatosIdentificativosOAseguradoInputDomain datosIdentificativosObjAseg = new DatosIdentificativosOAseguradoInputDomain();
	CaracteristicasInputDomain caracteristicas = new CaracteristicasInputDomain();
	DeclaracionesInputDomain declaraciones = new DeclaracionesInputDomain();
	DeclaracionesExtraInputDomain declaracionesExtra = new DeclaracionesExtraInputDomain();
	List<UnidadDeTarificacionInputDomain> unidadTarificacion = new ArrayList<>(DEFAULT_CAPACITY);

	/**
	 * Constructor de clase
	 */
	public ObjetoAseguradoHashInputDomain() {
		datosIdentificativosObjAseg = new DatosIdentificativosOAseguradoInputDomain();
		caracteristicas = new CaracteristicasInputDomain();
		declaraciones = new DeclaracionesInputDomain();
		unidadTarificacion = new ArrayList<>(DEFAULT_CAPACITY);
	}
}
