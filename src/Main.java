import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class TrabajoIntegrador {
    public class Pronosticos {

        public static void main(String[] args) throws IOException {
            leerArchivo();
        }
        public static void leerArchivo() throws IOException{
            String nombreArchivo = "C:\\Users\\Mélani\\Downloads\\Archivopronostico.txt";
            for (String linea : Files.readAllLines(Paths.get(nombreArchivo))){
                System.out.println(linea);
            }


        }
    }
}
