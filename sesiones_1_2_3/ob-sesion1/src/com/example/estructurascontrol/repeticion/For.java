package com.example.estructurascontrol.repeticion;

public class For {

    public static void main(String[] args) {

        for(int i = 0; i < 20; i++){
            // System.out.println("El valor de i es: " + i );
            // System.out.println("Hola mundo");
        }
                            // 0        1           2
        String[] nombres = {"Pepe", "Juanito", "Ruperta"}; // length 3
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

        int suma = 0;
        int[] numeros = {5, 7, 8}; // length 3
        for(int i = 0; i < numeros.length; i++){
            // suma = suma + numeros[i];
            suma += numeros[i];
        }


    }
}
