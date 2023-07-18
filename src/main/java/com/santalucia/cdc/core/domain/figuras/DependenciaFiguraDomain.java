package com.santalucia.cdc.core.domain.figuras;

import com.santalucia.cdc.core.domain.TipoMDLOuputDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DatoPersonal
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
@NoArgsConstructor
public class DependenciaFiguraDomain {
  /** Identificador único de póliza de dependencia dentro del ODL */
  private String idPolizaDependencia;
  /** Número de orden de persona de dependencia */
  private String numOrdDependencia;
  /** Código de causa de estado de dependencia */
  private String codCausEstDependencia;
}
