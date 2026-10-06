package Ejercicios.Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Indica cada cuántos segundos quieres que se guarde el saludo : " );
        int respuesta = Integer.parseInt(sc.nextLine());
        System.out.println("Pulsa ENTER para interrumpir el hilo");

        Thread t = new Thread(()->
        {
            try{

            while(!Thread.currentThread().isInterrupted())
                {
                    System.out.println("¡Hola mundo!");
                    Thread.sleep(1000 * respuesta);
                }

            }

            catch (InterruptedException ie)
            {
                System.out.println("Interrumpiendo hilo");
                System.out.println("Hilo Interrumpido.");
                System.out.println("¡Adiós!");
            }

        });
        t.start();

        sc.nextLine();

        t.interrupt();

        try
        {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
