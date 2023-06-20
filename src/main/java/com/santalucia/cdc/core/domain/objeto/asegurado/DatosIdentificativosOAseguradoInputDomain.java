package com.santalucia.cdc.core.domain.objeto.asegurado;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ObjetoAsegurado
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DatosIdentificativosOAseguradoInputDomain {

	private String codModServicio;
	private String codTipObjAseg;
	private String descTipObjAseg;
	private String idObjAsegODL;
	private String idPolizaODL;
	private String numCertificado;
	private String versPolizaODL;
	private String versPolizaOrigen;
	private String localTarif;
	private String numOrdenObjAseg;
	private String provTarif;

}
