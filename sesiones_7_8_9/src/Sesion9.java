import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Sesion9
{
    public static void leerTodo() {
        try {
            InputStream fichero = new FileInputStream("/etc/passwd");

            try {
                byte []datos = fichero.readAllBytes();
                for (byte dato : datos) {
                    System.out.print((char)dato);
                }
                fichero.close();

            } catch (IOException e) {
                System.out.println("No puedo leerlo: " + e.getMessage());
            }


        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: " + e.getMessage());
        }
    }

    public static void leerByteAByte() {
        try {
            InputStream fichero = new FileInputStream("/etc/passwd");

            try {
                byte []datos = new byte[5];
                int data = fichero.read(datos);


                while (data != -1) {
                    System.out.println("Leido: '" + (char)data + "' que es el código " + data);
                    data = fichero.read();
                }

            } catch (IOException e) {
                System.out.println("Error al leer: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir fichero: " + e.getMessage());
        }
    }
}
