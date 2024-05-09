import com.aluracursos.screenmacth.modelos.Episodio;
import com.aluracursos.screenmacth.modelos.Pelicula;
import com.aluracursos.screenmacth.modelos.Serie;
import com.aluracursos.screenmatch.calculos.CalculadoreDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula  = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracion(120);
        miPelicula.setIncluidoEnElPlan(true);
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(9);
        miPelicula.evalua(8);
        System.out.println(miPelicula.calculaMedia());
        System.out.println(miPelicula.getTotalDeEvaluaciones());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("Casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracion(180);
        otraPelicula.setIncluidoEnElPlan(true);



        CalculadoreDeTiempo calculadora = new CalculadoreDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(casaDragon);
        episodio.setTotalDeVisualisaciones(100);
        filtro.filtra(episodio);


    }
}
