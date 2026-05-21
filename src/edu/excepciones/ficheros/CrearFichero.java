package edu.excepciones.ficheros;

import java.io.File;
import java.io.IOException;

public class CrearFichero {
    public static void main(String[] args) {
        // 1. Definimos la ruta y el nombre del archivo
        File archivo = new File("empleados.csv");

        try {
            // 2. Intentamos crearlo
            if (archivo.createNewFile()) {
                System.out.println("¡Fichero creado con éxito!: " + archivo.getName());
                System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
            } else {
                System.out.println("El fichero ya existe en esa ruta.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el fichero.");
            e.printStackTrace();
        }
    }
}