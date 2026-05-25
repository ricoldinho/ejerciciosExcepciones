package edu.excepciones.ejerciciosTipo.ej2;

public class Principal {

    public static void main(String[] args) {
        System.out.println("CARGAMOS BASE DE DATOS");
        LectorCestas.iniciarCatalogo();
        double acumulador = 0;

        System.out.println("LEYENDO CODIGOS");
        int i = 0;
        for (String codigo : Cajero.getCodigosBarra()){
            i++;
            System.out.println("Leyendo producto: " + i);
            System.out.println(codigo);
            try{
                Integer codigoNumerico = Integer.parseInt(codigo);
                System.out.println("Información del producto:");
                Producto producto = LectorCestas.getCatalogoBd().get(codigoNumerico);
                double precioProducto = producto.getPrecio();
                acumulador += precioProducto;
                System.out.println(precioProducto);
            }catch(NumberFormatException nfe){
                System.err.println("Producto no encontrado por contener el código algún caracter inválido");
                nfe.getMessage();
            }catch(NullPointerException npe){
                System.err.println("Producto no encontrado");
                npe.getMessage();
            }

        }
        System.out.println("Precio total de la cesta: " + acumulador);
            }

}
