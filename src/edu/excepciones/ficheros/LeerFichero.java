package edu.excepciones.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
    public static void main(String[] args) {
        String nombreArchivo = "empleados.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {

            String lineaActual;
            boolean esPrimeraLinea = true;

            // readLine() devuelve la línea actual o null si ya no hay más texto
            while ((lineaActual = br.readLine()) != null) {

                // Opcional: Saltar la primera línea si es el encabezado
                if (esPrimeraLinea) {
                    esPrimeraLinea = false;
                    continue;
                }

                // Troceamos la línea por las comas
                String[] datos = lineaActual.split(",");

                // Aseguramos que la línea tiene las 4 columnas que esperamos
                if (datos.length == 4) {
                    String id = datos[0];
                    String nombre = datos[1];
                    String departamento = datos[2];
                    String salario = datos[3];

                    System.out.println("-------------------------");
                    System.out.println("Empleado ID: " + id);
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Dpto: " + departamento);
                    System.out.println("Salario: " + salario + " €");
                }
            }

        } catch (IOException e) {
            System.out.println("Error al intentar leer el fichero: " + e.getMessage());
        }
    }
}