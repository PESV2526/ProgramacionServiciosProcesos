package Ejercicios.Ejercicio4;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Contador cont = new Contador();
       Thread t = new Thread(cont);
       Random r = new Random();

       int limite = r.nextInt(10) + 11;
       System.out.println("Pulsa ENTER cuando crear que el contador ha llegado a " + limite);
       t.start();
       Scanner sc = new Scanner(System.in);
       sc.nextLine();
       cont.Detener();

       int valorFinal = cont.getContador();
       if (valorFinal == limite)
       {
           System.out.println("¡Lo has conseguido, marichocho!");
       }
       else
       {
       System.out.println("Vuelve a intentarlo, has detenido el contador en " + valorFinal);
       }

       try
       {
           t.join();
       }
       catch (InterruptedException e)
       {System.out.println(e);}
    }
}
