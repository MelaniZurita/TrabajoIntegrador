import java.util.List;
import java.lang.NullPointerException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        List<Partido> partidos = leerArchivoPartidos("C:\\Users\\Mélani\\Downloads\\resultado.txt");
        List<Resultado> resultados = leerArchivoResultados("C:\\Users\\Mélani\\Downloads\\resultado.txt");

        Pronostico prediccion = leerArchivoPronostico("C:\\Users\\Mélani\\Downloads\\pronostico.txt");

        int puntaje = Pronostico.calcularPuntaje(partidos, resultados);

        System.out.println("El puntaje de la persona es: " + puntaje);
    }

    private static Pronostico leerArchivoPronostico(String s) {
        return null;
    }

    private static List<Resultado> leerArchivoResultados(String s) {
        return null;
    }

    private static List<Partido> leerArchivoPartidos(String s) {
        return null;
    }
}