package com.santalucia.cdc.core.mappers;

import com.santalucia.cdc.core.domain.CargaODLInputDomain;
import com.santalucia.cdc.core.domain.objeto.asegurado.ColObjetoAseguradoInputDomain;
import neg.sl.cartera.polizas_odl.carga.value.ObjetoAsegurado;
import neg.sl.cartera.polizas_odl.mdl.value.EventosCompletosValue;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import javax.annotation.Nullable;

/**
 * Mapper de polizas a mensajes kafka
 *
 */
@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = OffsetDateTimeMapper.class)
@SuppressWarnings("NullAway.Init")
public interface PolicyInputMapper {

	/***************/
	/** ONE TO ONE**/
	/***************/

	/**
	 * Resource a dominio
	 * @param resource resource
	 * @return dominio
	 */
  CargaODLInputDomain toInputDomain(EventosCompletosValue resource);

	/**
	 * Objeto asegurado to domain
	 * @param domain
	 * @return
	 */
	@Mapping(target = "declaracionesExtra", source = "declaraciones")
  ColObjetoAseguradoInputDomain toColObjetoAsegurado(ObjetoAsegurado domain);

	/**
	 * Charsequence a String
	 * @param input CharSequence
	 * @return String
	 */
  @Nullable
	static String mapString(CharSequence input) {
		String result = null;
		if (input != null) {
			result = input.toString();
		}
		return result;
	}
}
