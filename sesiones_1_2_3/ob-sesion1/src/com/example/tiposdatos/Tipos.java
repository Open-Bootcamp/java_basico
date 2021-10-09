package com.example.tiposdatos;


/**
 * Crear un proyecto java desde cero.
 * Crear un paquete.
 * Dentro del paquete crear una clase.
 * Dentro de la clase crear un método main
 * Imprimir todos los tipos de datos vistos.
 *
 * Tipos de datos mas comunes:
 * int, long, double, boolean, String
 */
public class Tipos {

    public static void main(String[] args) {

        // 1. numericos


        // 1.1 enteros
        byte variable1 = 5;
        System.out.println(variable1);
        short variable2 = 10;
        int variable3 = 30;
        long variable4 = 100;
        long numeroTelefono = 666555444;
        // long precio = null;

        // 1.2 decimales
        float variable5 = 5.5f;
        double variable6 = 10.5d;
        variable6 = 20.5d;
        double precioSilla = 49.99;

        // 2. booleano
        boolean variable7 = false;
        boolean variable8 = true;

        // 3. texto
        char variable9 = 'a';
        String variable10 = "Lorem ipsum dolor sit amet.....";
    }
}
