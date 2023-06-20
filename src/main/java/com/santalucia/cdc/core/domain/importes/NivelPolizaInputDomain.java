package com.santalucia.cdc.core.domain.importes;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NonNull;

import javax.annotation.Nullable;

/**
 * NivelPoliza
 *
 * @author Nfq
 *
 */
@Data
public class NivelPolizaInputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Codigo de tipo de prima*/
  @Nullable
	String codTipoPrima;
	/** Denominacion de tipo de prima*/
  @Nullable
	String descTipoPrima;
	/** Primas*/
  @Nullable
  PrimaInputDomain primas;
	/** Sobre primas*/
  @NonNull
	List<SobrePrimaInputDomain> sobreprimas;
	/** Bonificaciones y descuentos*/
  @NonNull
	List<BonificacionesDescuentosInputDomain> bonificacionesYDescuentos;
	/** Recargos e impuestos*/
  @NonNull
	List<RecargosImpuestosInputDomain> recargosEImpuestos;
	/** Gastos*/
  @NonNull
	List<GastoInputDomain> gastos;

	/**
	 * Constructor de clase
	 */
	public NivelPolizaInputDomain() {
		sobreprimas = new ArrayList<>(DEFAULT_CAPACITY);
		bonificacionesYDescuentos = new ArrayList<>(DEFAULT_CAPACITY);
		recargosEImpuestos = new ArrayList<>(DEFAULT_CAPACITY);
		gastos = new ArrayList<>(DEFAULT_CAPACITY);
		codTipoPrima = null;
		descTipoPrima = null;
		primas = null;
	}
}
