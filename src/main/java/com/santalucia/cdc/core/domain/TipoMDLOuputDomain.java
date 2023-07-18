package com.santalucia.cdc.core.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Objeto poliza
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class TipoMDLOuputDomain {

  /** Codigo de Origne */
  private String codOrigen;
  /** Codgio de MDL */
  private String codMDL;

  /** Descripcion de Origen*/
  private String desOrigen;
}
