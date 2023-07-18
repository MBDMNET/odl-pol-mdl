package com.santalucia.cdc.core.domain.objeto.asegurado.declaraciones;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
/**
 * Declaraciones
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DeclaracionesExtraInputDomain {

	private String cantSuperLocal;
	private String cantSuperOficina;
	private String cantSuperOtros;
	private String cantSuperTrast;
	private String cantSuperTrastGaraj;
	private String cantSuperUrbanExt;
	private String cantSuperVivien;
	private String cantSuperZonDepJard;
	private String cantTrabEmpr;
	private String cantVasCervDia;
	private String cantVasCervFinSem;
	private String cantVasVinDia;
	private String cantVivV2;
	private String cantVivlocalCom;
	private String codReferCatastral;
	private LocalDate fecAbanBeb;
	private LocalDate fecAbanTab;
	private LocalDate fecInicConsTa;
	private LocalDate fecUltimAbo;
	private String numAnnosAntigInstAg;
	private String numAnnosAntigInstDes;
	private String porAumVencim;
	private String porMaterCombus;
	private String porMaterPrefabric;
	private String porOcupLocal;
	private String porSuperAcristalada;
	private String porVolumTotNoDestinVivien;
	private String tipIndustEstablec;
	private String valAnnoAgua;
	private String valAnnoConst;
	private String valAnnoDesag;
	private String valAnnoRehabEdific;
	private String valCilinMotoc;
	private String valEstatCm;
	private String valPesKg;
	private String valTensArtMax;
	private String valTensArtMin;

}
