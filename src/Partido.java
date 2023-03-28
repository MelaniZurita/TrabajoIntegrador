import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Partido {
    private String equipo1;
    private String equipo2;

    public Partido(String equipo1, String equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public Object getResultado() {
        return null;
    }
}