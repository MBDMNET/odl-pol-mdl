package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ComposicionSubgarantias
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ServiciosDomain {

  /** Identificador interno de GW para el servicio incluido en la garantía contratada */
  private Integer idServicio;
  /** Código que identifica al servicio contratado de forma única en formato del core */
  private String codServicio;
  /** Descripción que identifica al servicio contratado de forma única en formato del core */
  private String descServicio;
  /** Coste que posee el servicio contratado por el cliente dentro de la garantía */
  private Integer impCosteServicio;
  /** Campo que recoge el tipo de obligatoriedad que presenta el servicio seleccionado */
  private String codObligatoriedadSer;

}
