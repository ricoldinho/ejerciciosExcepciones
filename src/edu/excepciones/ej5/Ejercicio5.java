package edu.excepciones.ej5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TablonGremio.iniciarTablon();

        while(true){
            System.out.println("Introduce nombre de héroe para buscar o escribe salir para terminar");
            String entrada = sc.nextLine();
            if(entrada.equalsIgnoreCase("salir")){
                break;
            }
            try{
                System.out.println(TablonGremio.verMisiones(entrada));
            } catch (HeroeNoRegistradoException e) {
                System.err.println(e.getMessage());
            }

        }
    }
}
