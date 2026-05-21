package edu.excepciones.test.propagar;

public class PasarelaDePago {
    private Banco banco = new Banco();

    // Propaga la excepción hacia arriba
    public void procesarTarjeta(double cantidad) throws FondosInsuficientesException {
        System.out.println("💳 Pasarela: Conectando de forma segura con el banco...");

        banco.descontarSaldo(cantidad); // Si esto falla, la excepción salta y sale de este método
    }
}