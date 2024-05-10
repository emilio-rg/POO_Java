package com.aluracursos.radioalura.modelos;

public class Podcast extends Audio {

    private String locutor;
    private String descripcion;

    @Override
    public int getClasificacion() {
        if(getTotalDeReproducciones() >= 2000){
            return 9;
        }else{
            return 2;
        }
    }

    public String getLocutor() {
        return locutor;
    }

    public void setLocutor(String locutor) {
        this.locutor = locutor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
