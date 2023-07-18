package com.santalucia.cdc.core.domain.objeto.asegurado.caracteristicas;

import com.santalucia.cdc.core.domain.estructura.geografica.DomicilioOutputDomain;
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
public class CaracteristicasOutputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	private List<DomicilioOutputDomain> domicilioObjAseg = new ArrayList<>(DEFAULT_CAPACITY);
	private List<FiguraOutputDomain> figura = new ArrayList<>(DEFAULT_CAPACITY);
	private List<AnimalesOutputDomain> animales = new ArrayList<>(DEFAULT_CAPACITY);
	private List<DisposicionesElectronicasOutputDomain> dispositivosElectronicos = new ArrayList<>(DEFAULT_CAPACITY);

}
