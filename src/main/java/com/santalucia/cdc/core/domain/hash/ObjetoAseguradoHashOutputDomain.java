package com.santalucia.cdc.core.domain.hash;

import com.santalucia.cdc.core.domain.objeto.asegurado.DatosIdentificativosOAseguradoInputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.DatosIdentificativosOAseguradoOutputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.caracteristicas.CaracteristicasInputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.caracteristicas.CaracteristicasOutputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.declaraciones.DeclaracionesExtraInputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.declaraciones.DeclaracionesInputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.declaraciones.DeclaracionesOutputDomain;
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
public class ObjetoAseguradoHashOutputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	DatosIdentificativosOAseguradoOutputDomain datosIdentificativosObjAseg = new DatosIdentificativosOAseguradoOutputDomain();
	CaracteristicasOutputDomain caracteristicas = new CaracteristicasOutputDomain();
	DeclaracionesOutputDomain declaraciones = new DeclaracionesOutputDomain();
	DeclaracionesExtraInputDomain declaracionesExtra = new DeclaracionesExtraInputDomain();
	List<UnidadDeTarificacionInputDomain> unidadTarificacion = new ArrayList<>(DEFAULT_CAPACITY);

	/**
	 * Constructor de clase
	 */
	public ObjetoAseguradoHashOutputDomain() {
		datosIdentificativosObjAseg = new DatosIdentificativosOAseguradoOutputDomain();
		caracteristicas = new CaracteristicasOutputDomain();
		declaraciones = new DeclaracionesOutputDomain();
		unidadTarificacion = new ArrayList<>(DEFAULT_CAPACITY);
	}
}
