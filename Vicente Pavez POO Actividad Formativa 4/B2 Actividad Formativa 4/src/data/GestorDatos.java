/*
 * Representa al guardado de un registro dentro de Llanquihue Tour
 * Contiene el codigo necesario para guardar los datos en un archivo txt ubicado en "resources/tours.txt"
 * También puedes modificar los registros en el archivo txt ubicado dentro de "resources/tours.txt" 
 * Los datos de cada clase están separados mediante el caracter ";"
 */

package data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class GestorDatos {
        public static final String archivoDatos = "resources/tours.txt"; {
            Path archivoDatos = Paths.get("resources/tours.txt");
        
        try {
            String linea = Files.readString(archivoDatos);
            String[] partes = linea.split(";");
            if (partes.length >= 25) {
                datosTour(
                    partes[0].trim(),
                    partes[1].trim(),
                    partes[2].trim(),
                    partes[3].trim(),
                    partes[4].trim(),
                    partes[5].trim()
                );
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato de los números: " + e.getMessage());
        }
    }

    public static void datosTour(String parte, String parte0, String parte1, String parte2, String parte3, String parte4) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDatos, true))) {
            bw.write(parte + ";" + parte0 + ";" + parte1 + ";" + parte2 + ";" + parte3 + ";" + parte4);
            bw.newLine();
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo: " + ex.getMessage());
        }  
    }
}