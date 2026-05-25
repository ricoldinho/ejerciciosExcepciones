package edu.excepciones.ejerciciosTipo.ej1;

import java.util.HashMap;

public class ServidorNube {

    private static HashMap<String, String> almacenamiento = new HashMap<>();

    public static String descargarArchivo(String nombreArchivo) throws ArchivoNoEncontradoException {
        if(almacenamiento.containsKey(nombreArchivo)){
            return almacenamiento.get(nombreArchivo);
        }
        throw new ArchivoNoEncontradoException("El archivo no existe no el servidor");
    }

    public static void iniciarMapaConContenido(){
        almacenamiento.put("empleados", "información de empleados");
        almacenamiento.put("futbolistas", "información de futbolistas");
        almacenamiento.put("peliculas", "información de películas");
    }
}
