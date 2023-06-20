package com.santalucia.cdc.core.domain.objeto.asegurado.declaraciones;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Declaraciones
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DeclaracionesInputDomain {

	/**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;

	private List<CantAnimTotalInputDomain> cantAnimTotales = new ArrayList<>(DEFAULT_CAPACITY);
	private List<IndicadoresInputDomain> indicadores = new ArrayList<>(DEFAULT_CAPACITY);
	private List<NumeroFincaRegistralInputDomain> numFincRegistral = new ArrayList<>(DEFAULT_CAPACITY);
	private List<PorcentajeVolumTotalInputDomain> porVolumTotal = new ArrayList<>(DEFAULT_CAPACITY);
	private List<ProductosExplinfInputDomain> prodExpInf = new ArrayList<>(DEFAULT_CAPACITY);
	private String cantAbortos;
	private String cantBannos;
	private String cantCigDia;
	private String cantCopLicDia;
	private String cantCopLicFinSem;
	private String cantCubWhisDia;
	private String cantCubWhisFinSem;
	private String cantDiasCierSeman;
	private String cantDiasConsCierVacac;
	private String cantEmpleados;
	private String cantFachadAcristal;
	private String cantForrajKilog;
	private String cantHijos;
	private String cantLitrCervDia;
	private String cantLitrCervFinSem;
	private String cantLitrVinDia;
	private String cantLitrVinFinSem;
	private String cantLocalComerc;
	private String cantMesEmb;
	private String cantMetrAltNivSuelo;
	private String cantMetrLinMurVallas;
	private String cantOficinas;
	private String cantPersAforo;
	private String cantPersUnidFamil;
	private String cantPipDia;
	private String cantPlantAlto;
	private String cantPlantBajo;
	private String cantPlantEdificio;
	private String cantPlantEstab;
	private String cantPlantEstabAlto;
	private String cantPlantEstabBajo;
	private String cantPlazGarajTrast;
	private String cantPortales;
	private String cantPurDia;
	private String cantSuperAlmac;
	private String cantSuperEdific;
	private String cantSuperExplot;
	private String cantSuperGaraj;
	private String cantSuperGarajTrast;

}
