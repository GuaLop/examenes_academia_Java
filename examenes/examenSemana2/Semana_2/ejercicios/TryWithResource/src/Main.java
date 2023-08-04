import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Archivo que queremos leer
        String filePath = "ruta/del/archivo.txt";

        /**Se declara el 'BufferedReader' dentro del paréntesis del 'try', y el compilador se encargará automáticamente
         * de cerrar el recurso una vez que el bloque try haya finalizado*/

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al leer el archivo: " + e.getMessage());
        }
    }
}