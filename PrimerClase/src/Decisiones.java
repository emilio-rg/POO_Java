public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoDePlan = "plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas mas populares");
        }
        else{
            System.out.println("Peliculas retro que uan valen la pena ver");
        }

    if(incluidoEnElPlan && tipoDePlan.equals("plus")){
        System.out.println("Disfruta tu pelicula");
        }
    else{
        System.out.println("Pelicula no disponible pra su plan actual");
        }
    }
}
