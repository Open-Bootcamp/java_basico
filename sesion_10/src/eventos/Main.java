package eventos;

import java.util.ArrayList;

interface Mensajero {
    void hanSaludado();
}

class Receptor implements Mensajero {
    @Override
    public void hanSaludado() {
        System.out.println(Math.random());
    }
}

class ReceptorMusical implements Mensajero {
    @Override
    public void hanSaludado() {
        System.out.println("Soy un receptor musical");
    }
}

class Emisor {
    private ArrayList<Mensajero> receptores = new ArrayList<Mensajero>();

    public void meteReceptor(Mensajero receptor) {
        receptores.add(receptor);
    }

    public void saluda() {
        for (Mensajero ml : receptores) {
            ml.hanSaludado();
        }
    }
}



public class Main
{
    public static void main(String []args) {
        Emisor emisor = new Emisor();
        Receptor receptor = new Receptor();
        Receptor receptor2 = new Receptor();
        Receptor receptor3 = new Receptor();
        Receptor receptor4 = new Receptor();
        ReceptorMusical rm = new ReceptorMusical();

        emisor.meteReceptor(receptor);
        emisor.meteReceptor(receptor2);
        emisor.meteReceptor(receptor3);
        emisor.meteReceptor(receptor4);
        emisor.meteReceptor(rm);

        emisor.saluda();
    }
}
