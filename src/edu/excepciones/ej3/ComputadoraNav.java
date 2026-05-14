package edu.excepciones.ej3;

import java.util.HashMap;

public class ComputadoraNav {
    private HashMap<String, String> mapaEstelar = new HashMap<>();

    public ComputadoraNav() {
        mapaEstelar.put("Marte", "X:45 Y:99 Z:-12");
        mapaEstelar.put("Tierra", "X:0 Y:0 Z:0");
    }

    public String obtenerCoordenadas(String planeta) throws PlanetaDesconocidoException {
        if (!mapaEstelar.containsKey(planeta)) {
            throw new PlanetaDesconocidoException(planeta);
        }
        return mapaEstelar.get(planeta);
    }

}
