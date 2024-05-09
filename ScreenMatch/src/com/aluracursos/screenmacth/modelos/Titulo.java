package com.aluracursos.screenmacth.modelos;

public abstract class Titulo {

        private String nombre;
        private int fechaDeLanzamiento;
        private int duracion;
        private boolean incluidoEnElPlan;
        private double sumaDeEvaluaciones;

        public String getNombre() {
            return nombre;
        }

        public int getFechaDeLanzamiento() {
            return fechaDeLanzamiento;
        }

        public int getDuracionEnMinutos() {
            return duracion;
        }

        public boolean isIncluidoEnElPlan() {
            return incluidoEnElPlan;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
            this.fechaDeLanzamiento = fechaDeLanzamiento;
        }

        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }

        public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
            this.incluidoEnElPlan = incluidoEnElPlan;
        }

        private int totalDeEvaluaciones;



        public int getTotalDeEvaluaciones(){
            return totalDeEvaluaciones;
        }

        public void muestraFichaTecnica(){
            System.out.println("El nombre de la pelicula es: " + nombre);
            System.out.println("La fecha de lanzamiento es: " + fechaDeLanzamiento);
            System.out.println("La duracion en minutos es: " + getDuracionEnMinutos());

        }

        public void evalua(double nota){
            sumaDeEvaluaciones += nota;
            totalDeEvaluaciones++;

        }

        public double calculaMedia(){
            return sumaDeEvaluaciones / totalDeEvaluaciones;

        }


}
