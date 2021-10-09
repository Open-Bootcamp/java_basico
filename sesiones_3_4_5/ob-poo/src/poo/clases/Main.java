package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {

    public static void main(String[] args) {

        // 1. clases y objetos
        // Clase identificador = new Clase();
        Vehiculo toyotaPrius = new Vehiculo();
        Motor motorGTI = new Motor("GTI", 190, 459.0, 6);

        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, 0, motorGTI);

        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.speed); // 0
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed); // 50

        // 2. herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";


        System.out.println("fin de programa");

        // 3. polimorfismo
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        // 4. clases abstractas: no se pueden instanciar, solo instancian las clases hijas
    }
}
