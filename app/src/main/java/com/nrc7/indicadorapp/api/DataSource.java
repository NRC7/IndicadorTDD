package com.nrc7.indicadorapp.api;

import com.nrc7.indicadorapp.model.IndicadorEconomico;
import com.nrc7.indicadorapp.model.SerieIndicador;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataSource {

    IData callback;

    public DataSource(IData callback) {
        this.callback = callback;
    }

    // Metodo que ejecutara la consulta a la API
    public void getIndicador(String tipo, String fecha) {
        // Union entre BASE_URL + Parte variable (@GET)
        Api api = RetrofitClient.getRetrofitInstance().create(Api.class);

        // Iniciar llamado a la API, basado en el POJO externo
        Call<IndicadorEconomico> call = api.getIndicadorEconomico(tipo, fecha);

        // Encolo la llamada asyncrona, para que se ejecute sin obstruir la UI
        call.enqueue(new Callback<IndicadorEconomico>() {
            // EXITOSO
            @Override
            public void onResponse(Call<IndicadorEconomico> call, Response<IndicadorEconomico> response) {
                // response.body() == IndicadorEconomico.class
               /* IndicadorEconomico economico = response.body();
                SerieIndicador serieIndicador = response.body().getSerie().get(0);
                String valor = String.valueOf(response.body().getSerie().get(0).getValor());
                String fecha = response.body().getSerie().get(0).getFecha();*/

               // Obtener datos desde la respuesta a la API MIINDICADOR
                String valor = String.valueOf(response.body().getSerie().get(0).getValor());
                // Enviar la variable valor al MainActivity
                callback.notificarValor(valor);
            }
            // FALLIDO
            @Override
            public void onFailure(Call<IndicadorEconomico> call, Throwable t) {
                t.getMessage();
            }
        });
    }
}
