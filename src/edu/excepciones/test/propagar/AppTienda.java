package edu.excepciones.test.propagar;

public class AppTienda {
    public static void main(String[] args) {
        Tienda miTienda = new Tienda();

        System.out.println("--- BIENVENIDO A LA TIENDA ---");

        try {
            // El usuario intenta comprar un juego de 70€ (pero solo tiene 50€ en el banco)
            miTienda.comprarVideojuego(70.0);

        } catch (FondosInsuficientesException e) {
            //ATRAPAMOS LA EXCEPCIÓN que ha viajado por 3 clases distintas
            System.out.println("\n ERROR EN LA INTERFAZ: " + e.getMessage());
            System.out.println("Sugerencia: Por favor, utiliza otra tarjeta o recarga tu saldo.");
        }

        System.out.println("\n--- GRACIAS POR VISITARNOS ---");
    }
}