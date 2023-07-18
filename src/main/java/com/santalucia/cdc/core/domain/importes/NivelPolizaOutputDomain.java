package com.santalucia.cdc.core.domain.importes;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NonNull;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/**
 * NivelPoliza
 *
 * @author Nfq
 *
 */
@Data
public class NivelPolizaOutputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	/** Codigo de tipo de prima*/
  @Nullable
  private TipoMDLOuputDomain tipoPrima;
	/** Primas*/
  @Nullable
  PrimaInputDomain primas;
	/** Sobre primas*/
  @NonNull
	List<SobrePrimaInputDomain> sobreprimas;
	/** Bonificaciones y descuentos*/
  @NonNull
	List<BonificacionesDescuentosOutputDomain> bonificacionesYDescuentos;
	/** Recargos e impuestos*/
  @NonNull
	List<RecargosImpuestosOutputDomain> recargosEImpuestos;
	/** Gastos*/
  @NonNull
	List<GastoInputDomain> gastos;

	/**
	 * Constructor de clase
	 */
	public NivelPolizaOutputDomain() {
		sobreprimas = new ArrayList<>(DEFAULT_CAPACITY);
		bonificacionesYDescuentos = new ArrayList<>(DEFAULT_CAPACITY);
		recargosEImpuestos = new ArrayList<>(DEFAULT_CAPACITY);
		gastos = new ArrayList<>(DEFAULT_CAPACITY);
		tipoPrima = new TipoMDLOuputDomain();
		primas = null;
	}
}
