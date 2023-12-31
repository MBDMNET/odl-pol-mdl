package com.santalucia.cdc.core.domain.datos.cobro;

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
public class DatosCobroBancarioInputDomain {

	/** Indicador tipo domicilio bancario */
	private String indTipDomBanc;
	/** Denominacion tipo domicilio bancario */
	private String descTipDomBanc;
	/** Codigo de entidad bancaria */
	private String codEntBanc;
	/** Denominacion de entidad bancaria */
	private String descEntBanc;
	/** Numero de digito de control del numero de cuenta */
	private Integer numDigContrNumCuent;
	/** Numero de digito de control entidad/oficina */
	private Integer numDigContrEntidOfic;
	/** Numero de cuenta bancaria */
	private Long numCuentBanc;
	/** Titular de la cuenta bancaria */
	private String titulCuentBanc;
	/** Codigo IBAN*/
	private String codIban;
	/** Codigo BIC*/
	private String codBic;
}
