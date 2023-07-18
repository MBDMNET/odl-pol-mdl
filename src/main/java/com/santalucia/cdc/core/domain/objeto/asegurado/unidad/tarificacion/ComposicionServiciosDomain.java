package com.santalucia.cdc.core.domain.objeto.asegurado.unidad.tarificacion;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * ComposicionSubgarantias
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class ComposicionServiciosDomain {
  /**
   * Capacidad inicial por defecto
   */
  private static final int DEFAULT_CAPACITY = 10;
  private List<ServiciosDomain> ervicios = new ArrayList<>(DEFAULT_CAPACITY);
}
