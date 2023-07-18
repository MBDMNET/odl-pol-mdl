package com.santalucia.cdc.core.domain.objeto.asegurado;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
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
public class DatosIdentificativosOAseguradoOutputDomain {

	private String codModServicio;
  private TipoMDLOuputDomain tipoObjetoAsegurado;
	private String idObjAsegODL;
	private String idPolizaODL;
	private String numCertificado;
	private String versPolizaODL;
	private String versPolizaOrigen;
	private String localTarif;
	private String numOrdenObjAseg;
	private String provTarif;

}
