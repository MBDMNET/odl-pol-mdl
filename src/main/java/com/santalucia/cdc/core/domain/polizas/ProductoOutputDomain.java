package com.santalucia.cdc.core.domain.polizas;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Producto
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ProductoOutputDomain {

	/** Ramo*/
  private TipoMDLOuputDomain ramo;
	/** Codigo de producto tecnico*/
	private String codProductoTecnico;
	/** Denominacion del producto tecnico*/
	private String descProductoTecnico;
	/** Codigo del producto comercial*/
	private String codProducto;
	/** Denominacion del producto comercial*/
	private String descProducto;
	/** Modalidad comercial*/
  private TipoMDLOuputDomain modalidad;
	/** Denominacion de la modalidad interna*/
	private String descModalidadInter;
  /** Denominación de ramo comercial*/
  private String descRamoComercial;

}
