package com.nrc7.indicadorapp.api;

import com.nrc7.indicadorapp.model.IndicadorEconomico;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {
    // Parte variable de la URL a consultar
    // Apuntar al POJO más externo
    // @GET == obtener respuesta
    @GET ("{tipoIndicador}/{fechaIndicador}")
    Call<IndicadorEconomico> getIndicadorEconomico(@Path("tipoIndicador") String tipo, @Path("fechaIndicador") String fecha);
}
