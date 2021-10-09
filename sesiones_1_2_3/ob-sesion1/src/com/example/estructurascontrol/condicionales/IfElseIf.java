package com.example.estructurascontrol.condicionales;

public class IfElseIf {

    public static void main(String[] args) {

        String dia = "DiaNostro";

        // ejemplos comparar
        boolean resultadoCompararNum = 5 == 5;
        boolean resultado = dia.equals("Martes");

        // if else if

        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana champions");

        } else if (dia.equals("Martes")) {
            System.out.println("Martes con M de Me besas");

        } else if (dia.equals("Miercoles")) {
            System.out.println("Miercoles con M de Me besas");

        } else if (dia.equals("Jueves")) {
            System.out.println("Ya es juernes");

        } else if (dia.equals("Viernes")) {
            System.out.println("Nos fuimos!");

        } else if (dia.equals("Sabado")) {
            System.out.println("Nos murimos!");

        } else if (dia.equals("Domingo")) {
            System.out.println("Depresión");
        } else {
            System.out.println("El día introducido no es un día válido.");
        }


    }
}
