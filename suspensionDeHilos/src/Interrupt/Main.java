package Interrupt;

import java.util.Scanner;

//Cuando llamaos al metodo interrupt de un hilo, lanza un exepcion.
public class Main {
    public static void main(String[] args) {

        //lanzamos el hilo
        Cafetera c = new Cafetera();
        Thread t = new Thread(c);
        t.start();


        //Cuando el usuario pulse enter detenemos el hilo
        System.out.println("Presiona intro para detener la cafetera.");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        //Si se ejecuta la siguiente linea es porque el usuario ha pulsado la tecla enter
        t.interrupt();

        //la finalización no es instantanea, así que esperamos a que realmente finalice
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Total de cafés: " + c.getContador());
    }
}
