package com.nrc7.indicadorapp.model;

import java.util.List;

public class IndicadorEconomico {

    private String nombre, unidadDeMedida;
    private List<SerieIndicador> serie;

    // Como es un POJO (Contenedor), solo Getter
    public String getNombre() {
        return nombre;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public List<SerieIndicador> getSerie() {
        return serie;
    }
}
