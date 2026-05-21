package edu.excepciones.ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {
    public static void main(String[] args) {
        String nombreArchivo = "empleados.csv";

        // El bloque try-with-resources cierra el BufferedWriter automáticamente
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {

            // Escribimos el encabezado del CSV
            bw.write("ID,Nombre,Departamento,Salario");
            bw.newLine(); // Salto de línea

            // Escribimos los datos separados por comas
            bw.write("1,Ana Garcia,IT,3500.50");
            bw.newLine();
            bw.write("2,Carlos Lopez,Ventas,2800.00");
            bw.newLine();
            bw.write("3,Beatriz Ruiz,RRHH,3100.00");
            bw.newLine();

            System.out.println("Datos escritos correctamente en el CSV.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }
}
