package com.nrc7.indicadorapp.model;

public class SerieIndicador {

    private String fecha;
    private double valor;

    // Como es un POJO (Contenedor), solo Getter
    public String getFecha() {
        return fecha;
    }

    public double getValor() {
        return valor;
    }
}
