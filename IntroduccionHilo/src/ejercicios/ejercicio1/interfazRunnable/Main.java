package ejercicios.ejercicio1.interfazRunnable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número n1: ");
        int n1 = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese un número n2: ");
        int n2 = Integer.parseInt(sc.nextLine());

        Thread t = new Thread(new Contador(n1, n2));
        t.start();

        System.out.println("El hilo se ha lanzado, cogelo! Que rueda!");
    }
}
