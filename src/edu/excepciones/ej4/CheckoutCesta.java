package edu.excepciones.ej4;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckoutCesta {
    public static void main(String[] args) {
        // Catálogo de descuentos válidos en base de datos
        HashMap<String, String> cuponesDB = new HashMap<>();
        cuponesDB.put("VERANO20", "20");
        cuponesDB.put("VIP", "50");
        cuponesDB.put("ERROR", "CINCO"); // Cupón corrupto en la DB

        // Lo que el usuario intenta aplicar
        ArrayList<String> cuponesUsuario = new ArrayList<>();
        cuponesUsuario.add("VERANO20");
        cuponesUsuario.add("INVENTADO"); // Dará NullPointerException al buscar
        cuponesUsuario.add("ERROR");     // Dará NumberFormatException al parsear

        int descuentoTotal = 0;

        for (String codigo : cuponesUsuario) {
            try {
                // Si no existe, devuelve null. Parsear null lanza NullPointerException
                String valorStr = cuponesDB.get(codigo);
                // Si existe pero es texto ("CINCO"), lanza NumberFormatException
                int valorDescuento = Integer.parseInt(valorStr);

                descuentoTotal += valorDescuento;
                System.out.println("✅ Cupón aplicado: " + codigo + " (-" + valorDescuento + "€)");

                // Captura múltiple unificada (Java 7+)
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println("❌ Aviso: El cupón '" + codigo + "' es inválido o está corrupto. Ignorando.");
                System.out.println(e.getMessage());
            }
        }

        System.out.println("🛒 Total de descuento acumulado: " + descuentoTotal + "€");
    }
}
