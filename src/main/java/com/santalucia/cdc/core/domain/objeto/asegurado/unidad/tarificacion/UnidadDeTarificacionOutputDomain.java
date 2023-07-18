package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion.capitales.CapitalesOutputDomain;
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
public class UnidadDeTarificacionOutputDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;

	private TipoMDLOuputDomain moneda;
	/** */
  private TipoMDLOuputDomain nivelTarificacion;
	/** */
	private String codTipPrima;
	/** */
	private String descTipPrima;
	/** */
	private String idNivelTarif;
	/** */
	private DatosIdentificativosTarifOutputDomain datosIdentificativosUnidadTarif = new DatosIdentificativosTarifOutputDomain();
	/** */
	private FechasTarifOutputDomain fechasUnidadTarif = new FechasTarifOutputDomain();
	/** */
	private DatosPropiosTarifOutputDomain datosPropios = new DatosPropiosTarifOutputDomain();
	/** */
	private PrimasTarifOutputDomain primasUnidadTarif = new PrimasTarifOutputDomain();
	/** */
	private CapitalesOutputDomain capitales = new CapitalesOutputDomain();
	/** */
	private List<SobreprimasTarifOutputDomain> sobreprimasUnidadTarif = new ArrayList<>(DEFAULT_CAPACITY);
	/** */
	private List<BonificacionesDescuentosTarifOutputDomain> bonificacionesDescuentos = new ArrayList<>(DEFAULT_CAPACITY);
	/** */
	private List<ComposicionGarantiasTarifOutputDomain> composicionGarantias = new ArrayList<>(DEFAULT_CAPACITY);

}
