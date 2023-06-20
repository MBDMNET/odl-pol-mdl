package com.santalucia.cdc.core.domain.polizas;

import java.util.ArrayList;
import java.util.List;

import com.santalucia.cdc.core.domain.coaseguro.CoaseguroInputDomain;
import com.santalucia.cdc.core.domain.datos.cobro.DatosCobroInputDomain;
import com.santalucia.cdc.core.domain.datos.identificativos.DatosIdentificativosInputDomain;
import com.santalucia.cdc.core.domain.estructura.geografica.EstructuraGeograficaInputDomain;
import com.santalucia.cdc.core.domain.fechasestados.FechasEstadosInputDomain;
import com.santalucia.cdc.core.domain.figuras.FigurasInputDomain;
import com.santalucia.cdc.core.domain.importes.ImportesInputDomain;
import com.santalucia.cdc.core.domain.metadata.MetadataInputDomain;
import com.santalucia.cdc.core.domain.reaseguro.ReaseguroInputDomain;

import lombok.Data;

/**
 * Objeto poliza
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
public class PolizaInputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Datos identificativos*/
	DatosIdentificativosInputDomain datosIdentificativos;
	/** Producto*/
	ProductoInputDomain producto;
	/** Fechas y estados*/
	FechasEstadosInputDomain fechasYEstados;
	/** Subcolectivos */
	List<SubColectivosInputDomain> subcolectivos;
	/** Datos cobro **/
	DatosCobroInputDomain datosCobro;
	/** Documentos */
	List<DocumentosInputDomain> documentos;
	/** Figuras */
	FigurasInputDomain figuras;
	/** Estructura comercial*/
	EstructuraComercialInputDomain estructuraComercial;
	/** Estructura geografica*/
	EstructuraGeograficaInputDomain estructuraGeografica;
	/** Importes */
	ImportesInputDomain importes;
	/** Campanas */
	List<CampanasInputDomain> campanas;
	/** Reaseguro */
	ReaseguroInputDomain reaseguro;
	/** Coaseguro */
	CoaseguroInputDomain coaseguro;
	/** Movimientos */
	MovimientosInputDomain movimientos;
	/** ClausulasGDPR */
	List<ClausulasGDPRInputDomain> clausulasGDPR;
	/** Metadata*/
	MetadataInputDomain metadata;
	/**Objetos asegurados*/
	List<ObjetoAseguradoPolizaInputDomain> objetosAsegurados;

	/**
	 * Constructor de clase
	 */
	public PolizaInputDomain() {
		datosIdentificativos = new DatosIdentificativosInputDomain();
		producto = new ProductoInputDomain();
		fechasYEstados = new FechasEstadosInputDomain();
		subcolectivos = new ArrayList<>(DEFAULT_CAPACITY);
		figuras = new FigurasInputDomain();
		estructuraComercial = new EstructuraComercialInputDomain();
		estructuraGeografica = new EstructuraGeograficaInputDomain();
		importes = new ImportesInputDomain();
		metadata = new MetadataInputDomain();
		campanas = new ArrayList<>(DEFAULT_CAPACITY);
		reaseguro = new ReaseguroInputDomain();
		coaseguro = new CoaseguroInputDomain();
		movimientos = new MovimientosInputDomain();
		clausulasGDPR = new ArrayList<>(DEFAULT_CAPACITY);
		datosCobro = new DatosCobroInputDomain();
		documentos = new ArrayList<>(DEFAULT_CAPACITY);
		objetosAsegurados = new ArrayList<>(DEFAULT_CAPACITY);
	}

}
