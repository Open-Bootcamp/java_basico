import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Streams
{
    public static void main(String []args) {
        try {
            InputStream fichero = new FileInputStream("/etc/passwd");

            try {
                System.out.println("longitud para leer: " + fichero.available());

                byte []datos = new byte[15];
                int data = fichero.read(datos);
                System.out.println(new String(datos));
            } catch (IOException e) {
                System.out.println("Error al leer: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir fichero: " + e.getMessage());
        }
    }

    public static void leerFichero() {
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

    public static void leerFichero2() {
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
