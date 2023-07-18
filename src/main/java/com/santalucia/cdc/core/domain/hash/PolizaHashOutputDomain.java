package com.santalucia.cdc.core.domain.hash;

import com.santalucia.cdc.core.domain.coaseguro.CoaseguroOutputDomain;
import com.santalucia.cdc.core.domain.datos.cobro.DatosCobroOutputDomain;
import com.santalucia.cdc.core.domain.datos.identificativos.DatosIdentificativosOutputDomain;
import com.santalucia.cdc.core.domain.estructura.geografica.EstructuraGeograficaOutputDomain;
import com.santalucia.cdc.core.domain.figuras.FigurasOutputDomain;
import com.santalucia.cdc.core.domain.importes.ImportesOutputDomain;
import com.santalucia.cdc.core.domain.polizas.*;
import com.santalucia.cdc.core.domain.reaseguro.ReaseguroOutputDomain;
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
public class PolizaHashOutputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Datos identificativos*/
	DatosIdentificativosOutputDomain datosIdentificativos;
	/** Producto*/
	ProductoOutputDomain producto;
	/** Fechas y estados*/
	FechasEstadosHashOutputDomain fechasYEstados;
	/** Subcolectivos */
	List<SubColectivosOutputDomain> subcolectivos;
	/** Datos cobro **/
	DatosCobroOutputDomain datosCobro;
	/** Documentos */
	List<DocumentosOutputDomain> documentos;
	/** Figuras */
	FigurasOutputDomain figuras;
	/** Estructura comercial*/
	EstructuraComercialOutputDomain estructuraComercial;
	/** Estructura geografica*/
	EstructuraGeograficaOutputDomain estructuraGeografica;
	/** Importes */
	ImportesOutputDomain importes;
	/** Campanas */
	List<CampanasOutputDomain> campanas;
	/** Reaseguro */
	ReaseguroOutputDomain reaseguro;
	/** Coaseguro */
	CoaseguroOutputDomain coaseguro;
	/** Movimientos */
	MovimientosOutputDomain movimientos;
	/** ClausulasGDPR */
	List<ClausulasGDPROutputDomain> clausulasGDPR;

	/**
	 * Constructor de clase
	 */
	public PolizaHashOutputDomain() {
		datosIdentificativos = new DatosIdentificativosOutputDomain();
		producto = new ProductoOutputDomain();
		fechasYEstados = new FechasEstadosHashOutputDomain();
		subcolectivos = new ArrayList<>(DEFAULT_CAPACITY);
		datosCobro = new DatosCobroOutputDomain();
		documentos = new ArrayList<>(DEFAULT_CAPACITY);
		figuras = new FigurasOutputDomain();
		estructuraComercial = new EstructuraComercialOutputDomain();
		estructuraGeografica = new EstructuraGeograficaOutputDomain();
		importes = new ImportesOutputDomain();
		campanas = new ArrayList<>(DEFAULT_CAPACITY);
		reaseguro = new ReaseguroOutputDomain();
		coaseguro = new CoaseguroOutputDomain();
		movimientos = new MovimientosOutputDomain();
		clausulasGDPR = new ArrayList<>(DEFAULT_CAPACITY);
	}

}
