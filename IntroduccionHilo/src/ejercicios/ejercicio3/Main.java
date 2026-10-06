package ejercicios.ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de hilos a crear: ");
        int n = sc.nextInt();

        Thread[] hilos = new Thread[n];

        for (int i = 0; i < n; i++) {
            String nombre = "Hilo " + (i + 1);

            hilos[i] = new Thread(new GeneradorPrimos(nombre), nombre);
            hilos[i].start();
        }

        boolean quedanVivos = true;

        while (quedanVivos) {
            quedanVivos = false;

            for (int i = 0; i < n; i++) {

                System.out.println(hilos[i].getId() + " " + hilos[i].getName() + " " + hilos[i].getState());


                if (hilos[i].isAlive()) {
                    quedanVivos = true;
                }
            }


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Hilo principal interrumpido.");
            }
        }
    }
}