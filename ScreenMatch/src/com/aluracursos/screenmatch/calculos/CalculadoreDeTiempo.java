package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmacth.modelos.Pelicula;
import com.aluracursos.screenmacth.modelos.Titulo;

public class CalculadoreDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();

    }
}
