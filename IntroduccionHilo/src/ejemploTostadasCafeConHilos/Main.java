package ejemploTostadasCafeConHilos;

public class Main {
    public static void main(String[] args) {
        Tostadora t = new Tostadora(); //creamos la instancia de la clase Tostadora
        t.start(); //esto ejecutará el hilo

        Cafetera c = new Cafetera();
        c.start();
    }
}
