package edu.excepciones.ej5;

public class HeroeNoRegistradoException extends Exception {

    public HeroeNoRegistradoException(String mensaje, int contador){
        super(mensaje);
        System.err.println("Has errado la búsqueda " + contador + " veces");
    }
}
