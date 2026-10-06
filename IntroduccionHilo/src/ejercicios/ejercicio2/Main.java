package ejercicios.ejercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de hilos a crear: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String nombre = "Hilo " + i;
            Thread t = new Thread(new GeneradorPrimos(nombre));
            t.start();
        }
    }
}