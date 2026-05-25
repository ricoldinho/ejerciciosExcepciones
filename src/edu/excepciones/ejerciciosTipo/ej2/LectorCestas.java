package edu.excepciones.ejerciciosTipo.ej2;

import java.util.HashMap;

public class LectorCestas {

    private static HashMap<Integer, Producto> catalogoBd = new HashMap<>();

    public static void iniciarCatalogo(){
        catalogoBd.put(123, new Producto("Bate", 10.5));
        catalogoBd.put(12, new Producto("Pelota", 3.5));
        catalogoBd.put(2, new Producto("Raqueta", 33.5));
    }

    public static HashMap<Integer, Producto> getCatalogoBd() {
        return catalogoBd;
    }

    public static void setCatalogoBd(HashMap<Integer, Producto> catalogoBd) {
        LectorCestas.catalogoBd = catalogoBd;
    }
}
