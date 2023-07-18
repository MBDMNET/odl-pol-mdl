package com.santalucia.cdc.core.domain.objeto.asegurado.caracteristicas;

import com.santalucia.cdc.core.domain.estructura.geografica.DomicilioInputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * ObjetoAsegurado
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class CaracteristicasInputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	private List<DomicilioInputDomain> domicilioObjAseg = new ArrayList<>(DEFAULT_CAPACITY);
	private List<FiguraInputDomain> figura = new ArrayList<>(DEFAULT_CAPACITY);
	private List<AnimalesInputDomain> animales = new ArrayList<>(DEFAULT_CAPACITY);
	private List<DisposicionesElectronicasInputDomain> dispositivosElectronicos = new ArrayList<>(DEFAULT_CAPACITY);

}
