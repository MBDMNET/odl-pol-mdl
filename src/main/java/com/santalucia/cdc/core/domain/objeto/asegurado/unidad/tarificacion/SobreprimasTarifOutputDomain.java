package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UnidadDeTarificacion
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class SobreprimasTarifOutputDomain {

	/** Sobreprima a Nivel de Tarificacion */
  private TipoMDLOuputDomain sobreprima;
	/** Importe de Sobreprima a Nivel de Tarificacion */
	private Double impSobreprima;
	/** Tasa de Sobreprima a Nivel de Tarificacion */
	private String tasSobreprima;
	/** Tipo de Calculo de Sobreprima a Nivel de Tarificacion */
	private String tipCalSobreprima;
}
