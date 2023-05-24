package org.example;

/**
 * The type Controlador.
 */
public class Controlador {

    /**
     * The constant A.
     */
    public static final int A = 5;

    /**
     * Instantiates a new Controlador.
     */
    public Controlador() {
        // TODO document why this constructor is empty
    }


    /**
     * Sumar int.
     *
     * @param n1 the n 1
     * @param n2 the n 2
     * @return the int
     */
    public int sumar(int n1, int n2){
        return n1+n2;
    }

    /**
     * Comparar.
     *
     * @param n the n
     */
    public void comparar(int n){
        for (int i = 0; i < 4; i++) {
            decision(A,n);
        }
    }

    private static void decision(int A,int n) {
        if (A < n) {
            System.out.println("el mayor es: "+n);

        } else {
            System.out.println("el mayor es: "+A);
        }
    }
}
