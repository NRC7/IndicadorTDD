package com.nrc7.indicadorapp.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    // Reemplazar por URL de la consulta
    // BASE_URL == A la parte fija de la URL
    private static final String BASE_URL = "https://mindicador.cl/api/";

    // RECETA
    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance(){
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
