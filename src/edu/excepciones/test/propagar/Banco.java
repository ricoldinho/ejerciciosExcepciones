package edu.excepciones.test.propagar;

public class Banco {

    // El 'throws' avisa a quien llame a este método de que puede explotar
    public void descontarSaldo(double cantidadCobro) throws FondosInsuficientesException {
        double saldoCliente = 50.0; // Simulamos que el cliente solo tiene 50€

        if (cantidadCobro > saldoCliente) {
            //NACE EL ERROR: Creamos y lanzamos la excepción
            throw new FondosInsuficientesException("Operación rechazada: El cliente solo tiene " + saldoCliente + "€ disponibles.");
        }

        System.out.println("Banco: Cobro de " + cantidadCobro + "€ realizado con éxito.");
    }
}