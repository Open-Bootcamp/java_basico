import java.math.BigDecimal;
import java.util.*;

public class Sesion7 {
    // En esta función suprimo los warnings de ConstantConditions, arrojados por los "if"
    // de starts/endsWith al ser siempre cierta/falsa la condición.
    @SuppressWarnings("ConstantConditions")
    public static void demoStrings() {
        // Declarar un string
        String cadena = "Esto es una cadena";

        // Obtener longitud de la cadena
        int cadenaLen = cadena.length();
        System.out.println(cadenaLen);

        // Convertir toda la cadena a minúsculas
        String cadenaMinus = cadena.toLowerCase();
        System.out.println(cadenaMinus);

        // Convertir toda la cadena a mayúsculas
        String cadenaMayus = cadena.toUpperCase();
        System.out.println(cadenaMayus);

        // Verificar si una cadena empieza por otra cadena
        if (cadena.startsWith("Es")) {
            System.out.println("La cadena empieza por \"Es\"'");
        }

        if (cadena.startsWith("hola")) {
            System.out.println("La cadena empieza por \"hola\"");
        }

        // Verificar si uan cadena finaliza por otra cadena
        if (cadena.endsWith("cadena")) {
            System.out.println("La cadena finaliza por \"cadena\"");
        }

        if (cadena.endsWith("adios")) {
            System.out.println("La cadena finaliza por \"adios\"");
        }

        // Imprimimr un string carácter a carácter
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            System.out.println("Caracter: " + caracter);
        }
    }

    // Para mostar una copia de array a mano, hay una copia literal en un for abajo del todo.
    // Como esto es un warning, vamos a suprimirlo, ya que queremos mostrar el ejemplo.
    @SuppressWarnings("ManualArrayCopy")
    public static void demoArrays() {
        // Declarar un array
        int []arrayUno = new int[5];

        // Asignar valores a un array previamente declarado:
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;

        // Declarar e inicializar un array
        String []arrayDos = {"Naranja", "Limon", "Pomelo"};

        // Recorrer un array:
        for (int i = 0; i < arrayUno.length; i++) {
            System.out.println("Posicion del array " + i + " contiene el valor " + arrayUno[i]);
        }

        // Recorrer un array con la forma corta:
        for (String citrico : arrayDos) {
            System.out.println("Cítrico actual " + citrico);
        }

        // Declarar un array multidimensional
        int [][]arrayBidiUno = new int[2][4];

        // Asignar valores a un array multidimensional previamente declarado:
        arrayBidiUno[0][0] = 1;
        arrayBidiUno[0][1] = 2;
        arrayBidiUno[0][2] = 3;
        arrayBidiUno[0][3] = 4;

        arrayBidiUno[1][0] = 10;
        arrayBidiUno[1][1] = 20;
        arrayBidiUno[1][2] = 30;
        arrayBidiUno[1][3] = 40;

        // Recorrer un array bidimensional:
        for (int i = 0; i < arrayBidiUno.length; i++) {
            for (int j = 0; j < arrayBidiUno[i].length; j++) {
                System.out.println("Posición: [" + i + "][" + j + "] y contiene el valor " + arrayBidiUno[i][j]);
            }
        }

        // Declarar e inicializar un array multidimensional
        int [][]arrayBidiDos = {
                {1, 2, 3, 4},
                {10, 20, 30, 40},
        };

        // Recorrer un array bidimensional:
        for (int i = 0; i < arrayBidiDos.length; i++) {
            for (int j = 0; j < arrayBidiDos[i].length; j++) {
                System.out.println("Posición: [" + i + "][" + j + "] y contiene el valor " + arrayBidiDos[i][j]);
            }
        }

        // "Crecer" un array.
        // Solo podemos hacerlo creando uno nuevo de más tamaño y llenándolo con el contenido del original.
        int nuevoArrayLen = arrayUno.length * 2;
        int []nuevoArray = new int[nuevoArrayLen];

        // Esto dará un warning: Copia manual del array
        for (int i = 0; i < arrayUno.length; i++) {
            nuevoArray[i] = arrayUno[i];
        }

        // Para copiar un array "elegántemente":
        System.arraycopy(nuevoArray, 0, arrayUno, 0, arrayUno.length);
    }

    public static void demoVector() {
        // Un vector es similar a un array, pero puede (de)crecer dinámicamente.
        Vector<Integer> vector = new Vector<>();

        // Añadir elementos
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("Contenido del vector: " + vector);

        // Quitar un elemento:
        vector.remove(1);
        System.out.println("Contenido del vector: " + vector);

        // Los vectores tienen capacidad y tamaño:
        System.out.println("Tamaño: " + vector.size() + " - Capacidad: " + vector.capacity());

        // Podemos ajustar la capacidad al tamaño actual:
        vector.trimToSize();
        System.out.println("Tamaño: " + vector.size() + " - Capacidad: " + vector.capacity());

        // Al añadir un elemento al vector, si superamos su capacidad, esta aumenta en capacityIncrement.
        // capacityIncrement se declara en el constructor del vector, y si es menor o igual a cero, por
        // defecto es el doble de la capacidad previa.
        vector.add(9);
        System.out.println("Tamaño: " + vector.size() + " - Capacidad: " + vector.capacity());

        // Recorrer un vector
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Valor en la posicion " + i + " del vector: " + vector.get(i));
        }

        // Recorrerlo con la forma corta:
        for (int i : vector) {
            System.out.println("Valor actual del vector: " + i);
        }

        // Comparar dos vectores
        Vector<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(3);
        vector2.add(9);

        if (vector.equals(vector2)) {
            System.out.println("Los dos vectores son equivalentes");
            System.out.println("    -> vector: " + vector);
            System.out.println("    -> vector: " + vector2);
        }
    }

    public static void demoList() {
        // Similares a los vectores, usando un array de forma subyacente.
        // No están sincronizados, es importante tenerlo en cuenta cuando necesitamos código "thread-safe".

        // Tambien varía la forma de aumentar su capacidad. Por defecto, el vector dobla la capacidad, y
        // el ArrayList aumenta con la formula "capacidad += capacidad * 0.5". En el constructor no podemos
        // darle un tamaño de autocrecimiento (a diferencia del Vector), y utiliza la formula previa.

        // Crear una lista de tipo ArrayList:
        ArrayList<String> lista = new ArrayList<>();

        // Añadir elementos
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        System.out.println("Contenido de la lista: " + lista);

        // Quitar un elemento:
        lista.remove("Dos");
        System.out.println("Contenido de la lista: " + lista);

        // Las listas tienen tamaño:
        System.out.println("Tamaño: " + lista.size());

        // Recorrer una lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Valor en la posicion " + i + " de la lista: " + lista.get(i));
        }

        // Recorrerlo con la forma corta:
        for (String e : lista) {
            System.out.println("Valor actual de la lista: " + e);
        }

        // Comparar dos listas
        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Uno");
        lista2.add("Tres");

        if (lista.equals(lista2)) {
            System.out.println("Las dos listas son equivalentes");
            System.out.println("    -> lista: " + lista);
            System.out.println("    -> lista2: " + lista2);
        }

        // Podemos convertir una lista en un array:
        String []array = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }

        for (String elemento : array) {
            System.out.println("Elemento de la lista convertida en array es: " + elemento);
        }

        // Otra forma de hacer lo mismo:
        for (Object arrayObjeto : lista.toArray()) {
            System.out.println("Elemento de la lista convertida en array es: " + arrayObjeto.toString());
        }

        // Las listas pueden ser de más tipos, además de ArrayList:
        LinkedList<String> listaEnlazada = new LinkedList<>();

        // Y tienen las mismas operaciones que un ArrayList:
        listaEnlazada.add("Hola");
        System.out.println(listaEnlazada.get(0));
        listaEnlazada.remove("Hola");

        // Y pueden copiarse unas a otras
        LinkedList<String> listaEnlazadaDos = new LinkedList<>(lista);

        // Podemos recorrer nuestra nueva lista, tipo enlazada, y a la que hemos copiado
        // los valores desde "lista", que es del tipo ArrayList.
        for (String elemento : listaEnlazadaDos) {
            System.out.println("Elemento actual en la lista enlazada: " + elemento);
        }

        // Cada tipo de lista tiene sus pros y sus contras:
        // ArrayList:
        //  - Utiliza un array dinámico internamente
        //  - Es más rápida para almacenar y buscar datos
        //  - Solo implementa la interfaz "List", por lo que solo puede actuar como una lista
        //
        // LinkedList:
        //  - Utiliza una lista doblemente enlazada a nivel interno
        //  - Es más rápida para modificar datos
        //  - Puede funcionar como lista y como cola, ya que implementa las interfaces "List" y "Deque"
        //
        // Hay más tipos, ¡búscalos!
    }

    public static void demoMap() {
        // Los mapas implementan colecciones "clave" = "valor".

        // Crear un mapa del tipo "HashMap":
        HashMap<String, Integer> mapa = new HashMap<>();

        // Añadir elementos:
        mapa.put("clave1", 1);
        mapa.put("clave2", 2);
        mapa.put("clave3", 3);

        // Imprimir un valor de una clave del mapa accediendo a él:
        System.out.println("Valor de \"clave2\": " + mapa.get("clave2"));

        // Eliminar una clave del mapa:
        mapa.remove("clave2");

        // Un mapa no puede tener claves duplicadas, esto no se añadirá de nuevo, pero si reemplazará
        // su valor por "4":
        mapa.put("clave3", 4);
        System.out.println("Valor de \"clave3\": " + mapa.get("clave3"));

        // Un mapa puede cambiar el valor de una clave. Es más rapido reemplazar una clave que conozcamos
        // con replace que mediante mapa.put:
        mapa.replace("clave3", 100);

        // Recorrer un mapa:
        for (Map.Entry<String, Integer> elemento : mapa.entrySet()) {
            System.out.println("Clave: " + elemento.getKey() + " - Valor: " + elemento.getValue());
        }
    }

    public static void demoMath() {
        // Math es muy preciso con decimales utilizando BigDecimal.
        double valorInicial = 3.14f;
        BigDecimal valorA = BigDecimal.valueOf(valorInicial);

        double valorSecundario = 3.15f;
        BigDecimal valorB = BigDecimal.valueOf(valorSecundario);

        // Suma el BigDecimal "valorB" a "valorA"
        BigDecimal resultado = valorA.add(valorB);

        // Imprime la suma
        System.out.println(resultado);
    }
}
