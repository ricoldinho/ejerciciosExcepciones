package edu.excepciones.ejerciciosTipo.ej2;

import java.util.ArrayList;
import java.util.Arrays;

public class Cajero {

    private static ArrayList<String> codigosBarra = new ArrayList<>(Arrays.asList("123", "88o", "888", "12", "2"));

    public static ArrayList<String> getCodigosBarra() {
        return codigosBarra;
    }

    public static void setCodigosBarra(ArrayList<String> codigosBarra) {
        Cajero.codigosBarra = codigosBarra;
    }
}
