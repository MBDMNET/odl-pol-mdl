package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion;

import com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion.capitales.CapitalesInputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * UnidadDeTarificacion
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class UnidadDeTarificacionInputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	private String codMoneda;
	/** */
	private String codNivelTarif;
	/** */
	private String codTipPrima;
	/** */
	private String descNivelTarif;
	/** */
	private String descTipPrima;
	/** */
	private String idNivelTarif;
	/** */
	private DatosIdentificativosTarifInputDomain datosIdentificativosUnidadTarif = new DatosIdentificativosTarifInputDomain();
	/** */
	private FechasTarifInputDomain fechasUnidadTarif = new FechasTarifInputDomain();
	/** */
	private DatosPropiosTarifInputDomain datosPropios = new DatosPropiosTarifInputDomain();
	/** */
	private PrimasTarifInputDomain primasUnidadTarif = new PrimasTarifInputDomain();
	/** */
	private CapitalesInputDomain capitales = new CapitalesInputDomain();
	/** */
	private List<SobreprimasTarifInputDomain> sobreprimasUnidadTarif = new ArrayList<>(DEFAULT_CAPACITY);
	/** */
	private List<BonificacionesDescuentosTarifInputDomain> bonificacionesDescuentos = new ArrayList<>(DEFAULT_CAPACITY);
	/** */
	private List<ComposicionGarantiasTarifInputDomain> composicionGarantias = new ArrayList<>(DEFAULT_CAPACITY);

}
