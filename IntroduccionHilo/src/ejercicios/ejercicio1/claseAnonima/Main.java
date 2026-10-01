package ejercicios.ejercicio1.claseAnonima;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número n1: ");
        int n1 = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese un número n2: ");
        int n2 = Integer.parseInt(sc.nextLine());

        Thread t = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Random r = new Random();
                for (int i = n1; i <= n2; i++)
                {
                    System.out.println(i);
                    try
                    {
                        Thread.sleep(r.nextInt(1000) + 1);
                    }
                    catch (InterruptedException e)
                    {
                        System.out.println("El hilo fue interrumpido.");
                    }
                }
            }
        });
        t.start();
        System.out.println("El hilo se ha lanzado, cogelo! Que rueda!");
    }
}

