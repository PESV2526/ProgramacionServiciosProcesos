package ejercicios.ejercicio3;

import java.util.Random;

public class GeneradorPrimos implements Runnable {

    private String nombre;


    public GeneradorPrimos(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        Random r = new Random();

        int limite = r.nextInt(100) + 1;

        System.out.println(nombre + ": Mostrando primos hasta el " + limite);

        for(int i = 1; i <= limite; i++) {
            if (esPrimo(i)) {

                System.out.println(nombre + ": " + i);

                try {
                    Thread.sleep(r.nextInt(501) + 500);
                } catch (InterruptedException e) {
                    System.out.println("Hilo Interrumpido.");
                }
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}