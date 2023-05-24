package org.example;

/**
 * The type Main.
 * @ author Isabel Cayuela Pérez
 */
public class Main {
    private static Persona persona1;
    private static Controlador miControlador;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        persona1 = new Persona(50,"isa", "cayuela");
        System.out.println("Datos: "+persona1.toString());
        miControlador=new Controlador();
        int sumared = miControlador.sumar(persona1.getEdad(), 10);
        System.out.println(sumared);
        miControlador.comparar(10);


    }
}