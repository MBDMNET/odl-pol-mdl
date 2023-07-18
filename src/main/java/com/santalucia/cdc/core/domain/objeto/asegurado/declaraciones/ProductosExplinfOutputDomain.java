package com.santalucia.cdc.core.domain.objeto.asegurado.declaraciones;

import lombok.Data;

/**
 * Obj. dominio - productos explinf
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
public class ProductosExplinfOutputDomain {

	  private String cantDiasExistProduc;
	  private String cantKilosExisProduct;
	  private String cantLitrExisProduct;
	  private String cantMetrCubExisProduct;
	  private String codTipoProduc;
	  private String descTipoProduc;
	  private Integer numOrdenProduc;

}
