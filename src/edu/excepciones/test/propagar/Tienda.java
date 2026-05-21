package edu.excepciones.test.propagar;

public class Tienda {
    private PasarelaDePago pasarela = new PasarelaDePago();

    // Propaga la excepción hacia arriba
    public void comprarVideojuego(double precioTotal) throws FondosInsuficientesException {
        System.out.println("🛒 Tienda: Iniciando el proceso de compra por " + precioTotal + "€...");

        pasarela.procesarTarjeta(precioTotal);

        // Si la pasarela falla, esta línea de abajo NUNCA se ejecutará
        System.out.println("🛒 Tienda: ¡Compra finalizada, enviando el juego!");
    }
}