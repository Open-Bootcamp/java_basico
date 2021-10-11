import java.util.Scanner;

public class Errores
{
    public static void main(String[] args) {
        //errorDivisionPorCero();
        //errorDivisionPorCeroTry();
        //errorOutOfBounds();
        //errorOutOfBoundsTry();
        errorLogico();
    }

    private static void errorDivisionPorCero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        int resultado = numeroA / numeroB;

        System.out.println("El resultado es: " + resultado);
    }

    private static void errorDivisionPorCeroTry() {
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

    private static void errorOutOfBounds() {
        int numeros[] = new int[3];
        int pos = numeros[3];
    }

    private static void errorOutOfBoundsTry() {
        try {
            int numeros[] = new int[3];
            int pos = numeros[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Estás accediendo a un elemetno que no existe: " + e.getMessage());
        }
    }

    private static void errorLogico() {
        int a = 5;
        int b = 10;
        int resultado = a - b;
        System.out.println("El resultado de sumar a + b es = " + resultado);
    }
}

//public class ValoresIncorrectosException extends Exception {
//    public ValoresIncorrectosException(String errorMessage) {
//        super(errorMessage);
//    }
//}
