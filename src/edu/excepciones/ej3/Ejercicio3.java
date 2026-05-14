package edu.excepciones.ej3;

public class Ejercicio3 {
    public static void main(String[] args) {
        ComputadoraNav nav = new ComputadoraNav();

        try {
            System.out.println("Tierra: " + nav.obtenerCoordenadas("Tierra"));
            System.out.println("Krypton: " + nav.obtenerCoordenadas("Krypton"));
        } catch (PlanetaDesconocidoException e) {
            System.out.println("⚠️ ERROR CRÍTICO DE NAVEGACIÓN: " + e.getMessage());
        }
    }
}