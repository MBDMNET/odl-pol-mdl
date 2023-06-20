package com.santalucia.cdc.core.mappers;


import neg.sl.cartera.polizas_odl.carga.value.CargaODLValue;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

/**
 * Mapper de polizas a mensajes kafka
 *
 */
@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = OffsetDateTimeMapper.class)
@SuppressWarnings("NullAway.Init")
public interface PolicyOutputMapper {

  /***************/
  /** ONE TO ONE**/
  /***************/

  /**
   * Resource a dominio
   * @param resource resource
   * @return dominio
   */
  CargaODLValue toOutputResource(PolizaOutputDomain resource);



}
