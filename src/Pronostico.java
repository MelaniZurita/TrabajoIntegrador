import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pronostico {
    private String equipo1;
    private String equipo2;
    private String pronosticoPersona;

    public Pronostico(String equipo1, String equipo2, String pronosticoPersona) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.pronosticoPersona = pronosticoPersona;
    }

    public static int calcularPuntaje(List<Partido> partido, List<Resultado> resultado) {
        return 0;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public String getPronosticoPersona() {
        return pronosticoPersona;
    }
}
