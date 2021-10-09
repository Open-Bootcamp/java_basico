package com.example.estructurascontrol.repeticion;

/**
 * Crear un bucle que permita concatenar textos y imprima el resultado final por consola.
 * Concatenar nombres
 * Los textos pueden venir de un array String
 * String[] nombres = {"", "", "", ""};
 */
public class While {

    public static void main(String[] args) {

        int contador = 0;

        while(contador < 10){
            String nombre = "Prueba";
            contador++;
            if (contador == 5){
                // break;
                continue;
            }
            System.out.println("Valor de contador  " + contador);
        }
        // Variable nombre está fuera del ámbito del que se creó
        // System.out.println(nombre);
    }
}
