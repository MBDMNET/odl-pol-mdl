package com.santalucia.cdc.core.domain.metadata;

import lombok.Data;
import lombok.NonNull;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Metadata
 *
 * @author Nfq
 *
 */
@Data
@SuppressWarnings("NullAway.Init")
public class MetadataOutputDomain {
  @Nullable
	/** Numero del ultimo usuario */
	String numUltUsuario;
	/** Fecha SQL*/
  @Nullable
	String fecSQL;
	/** Fecha recuperacion informacion no persistida*/
  @Nullable
	String fecNoPersistida;
	/** Fecha y hora de registro de los datos*/
  @Nullable
	String fecHoraRegistro;
	/** Fecha hasta que tiene validez los datos de la poliza*/
  @Nullable
	String fecFinDatos;
	/** Version del esquema*/
  @NonNull
	String version;
	/** Valor hash */
  @NonNull
  String hash;
	/** Indicador borrado*/
  @Nullable
	String indBorrado;
	/** Circuito origen*/
  @Nullable
	String circuitoOrigen;
	/** Datos adicionales*/
  @Nullable
	List<DatoAdiccionalOutputDomain> datosAdicionales;

	/**
	 * Constructor de clase
	 */
	public MetadataOutputDomain() {
		hash = "";
		version = "1";
		numUltUsuario = null;
		fecSQL = null;
		fecNoPersistida = null;
		fecHoraRegistro = null;
		fecFinDatos = null;
		indBorrado = null;
		circuitoOrigen = null;
		datosAdicionales = null;
	}
}
