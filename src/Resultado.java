import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Resultado {
    private String equipo1;
    private String equipo2;
    public int golesequipo1;
    public int golesequipo2;
    private String pronosticoPersona;

    public Resultado(String equipo1, String equipo2, int golesequipo1, int golesequipo2, String pronosticoPersona) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesequipo1= golesequipo1;
        this.golesequipo2 = golesequipo2;
        this.pronosticoPersona = pronosticoPersona;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public int getGoles1 () {
        return golesequipo1;
    }

    public int getGolesequipo2() {
        return golesequipo2;
    }

    public String getPronosticoPersona() {
        return pronosticoPersona;
    }

    public int calcularPuntos() {
        int puntos = 0;
        if (golesequipo1 == golesequipo2 && pronosticoPersona.equals("Empate")) {
            puntos = 1;
        } else if (golesequipo1 > golesequipo2 && pronosticoPersona.equals("Local")) {
            puntos = 1;
        } else if (golesequipo2 > golesequipo1 && pronosticoPersona.equals("Visitante")) {
            puntos = 1;
        }
        return puntos;
    }
}
