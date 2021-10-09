package poo.coninterfaces;

import poo.sininterfaces.Empleado;

public class Main {

    static EmpleadoCRUD empleadoCRUD;


    public static void main(String[] args) {

        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());
    }
}
