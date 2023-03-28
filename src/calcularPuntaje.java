import java.util.List;

public class calcularPuntaje {

    public int calcularPuntaje(List<Partido> partidos, List<Resultado> resultados) {
        int puntaje = 0;
        for (int i = 0; i < partidos.size(); i++) {
            Partido partido = partidos.get(i);
            Resultado resultado = resultados.get(i);
            if (partido.getResultado().equals(resultado)) {
                puntaje++;
            }
        }
        return puntaje;
    }
}