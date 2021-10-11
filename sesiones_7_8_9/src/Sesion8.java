import java.util.Scanner;

public class Sesion8 {
    public static void errorDivisionPorCero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        int resultado = numeroA / numeroB;

        System.out.println("El resultado es: " + resultado);
    }

    public static void errorDivisionPorCeroTry() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        try {
            int resultado = numeroA / numeroB;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("¡No se puede dividir por cero!");
        }
    }

    public static void errorOutOfBounds() {
        int []numeros = new int[3];
        System.out.println(numeros[3]);
    }

    public static void errorOutOfBoundsTry() {
        try {
            int []numeros = new int[3];
            System.out.println(numeros[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Estás accediendo a un elemetno que no existe: " + e.getMessage());
        }
    }

    public static void errorLogico() {
        int a = 5;
        int b = 10;
        int resultado = a - b;
        System.out.println("El resultado de sumar a + b es = " + resultado);
    }
}