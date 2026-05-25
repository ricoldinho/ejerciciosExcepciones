package edu.excepciones.ejerciciosTipo.ej1;

import java.util.Scanner;

public class ClienteNube {
    public static void main(String[] args) {

        ServidorNube.iniciarMapaConContenido();

        Scanner sc = new Scanner(System.in);
        System.out.println("Solicita archivo: ");
        String archivo = sc.nextLine();

        try {
            System.out.println(ServidorNube.descargarArchivo(archivo));
        } catch (ArchivoNoEncontradoException e) {
            System.err.println(e.getMessage());
        }
    }
}
