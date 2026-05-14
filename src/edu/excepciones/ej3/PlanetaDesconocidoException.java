package edu.excepciones.ej3;

public class PlanetaDesconocidoException extends Exception {

    public PlanetaDesconocidoException(String planeta) {
        super("🪐 Los sensores no encuentran el planeta: " + planeta);
    }
}
