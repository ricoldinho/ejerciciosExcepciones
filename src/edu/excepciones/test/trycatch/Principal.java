package edu.excepciones.test.trycatch;

import java.util.Scanner;

public class Principal {

    static final int CONSTANTE = 5;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número formato String: ");
        String entrada = sc.nextLine();
        int resultado = 0;
        try {
            if(entrada.isEmpty()){
                throw new EntradaInvalida("La entrada no puede ser vacía");
            }
            if(entrada.equalsIgnoreCase("5")){
                throw new EntradaInvalida("La entrada no puede ser 5");
            }
            resultado = CONSTANTE / Integer.parseInt(entrada);
            System.out.println(resultado);
        }catch(EntradaInvalida | NumberFormatException | ArithmeticException e){
            System.err.println(e.getMessage());
        }finally{
            System.out.println("OPERACION REALIZADA CON RESULTADO = " + resultado);
        }



    }
}
