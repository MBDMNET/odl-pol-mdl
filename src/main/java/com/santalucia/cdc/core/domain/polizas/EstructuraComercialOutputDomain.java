package com.santalucia.cdc.core.domain.polizas;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * EstructuraComercial
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class EstructuraComercialOutputDomain {

	/** Canal de mediacion */
  private TipoMDLOuputDomain canal;
	/** Medio de distribucion*/
  private TipoMDLOuputDomain medioDistribucion;
	/** Codigo de agencia*/
  private TipoMDLOuputDomain agencia;
	/** Zona*/
  private TipoMDLOuputDomain zona;
	/** Codigo de distrito*/
  private TipoMDLOuputDomain distrito;
	/** Oficina*/
  private TipoMDLOuputDomain oficina;
	/** Mediador*/
  private TipoMDLOuputDomain canalMediador;
	/** Codigo de tipo de mediador*/
  private TipoMDLOuputDomain tipoColaborador;
	/** Colaborador*/
  private TipoMDLOuputDomain colaborador;
  private TipoMDLOuputDomain tipColaboradorIni;
	/** Colaborador inicial*/
  private TipoMDLOuputDomain colaboradorIni;
	/** Monitor*/
  private TipoMDLOuputDomain monitor;
	/** Monitor inicial*/
  private TipoMDLOuputDomain monitorIni;
	/** Red de venta */
  private TipoMDLOuputDomain redVenta;
}
