package com.santalucia.cdc.core.domain.datos.cobro;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * Objeto Datos Cobro
 *
 * @author Nfq
 *
 */

@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DatosOtrosCobrosPagosBancariosOutputDomain {

	/** Indicador tipo domicilio bancario */
	private String indTipDomBanc;
	/** Denominacion tipo domicilio bancario */
	private String descTipDomBanc;
	/** Entidad bancaria */
  private TipoMDLOuputDomain entidadBancaria;
	/** Numero de digito de control del numero de cuenta */
	private Integer numDigContrNumCuent;
	/** Numero de digito de control entidad/oficina */
	private Integer numDigContrEntidOfic;
	/** Numero de cuenta bancaria */
	private Long numCuentBanc;
	/** Titular de la cuenta bancaria */
	private String titulCuentBanc;
	/** Codigo IBAN */
	private String codIban;
	/** Codigo BIC */
	private String codBic;
}
