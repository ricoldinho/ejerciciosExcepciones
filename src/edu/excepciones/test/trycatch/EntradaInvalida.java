package edu.excepciones.test.trycatch;

public class EntradaInvalida extends RuntimeException {

    public EntradaInvalida(String mensaje) {
        super(mensaje);
    }

}
