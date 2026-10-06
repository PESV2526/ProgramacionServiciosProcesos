package Join;

import java.util.Random;
//Suspensión con método join
public class Main
{
    public static void main(String[] args)
    {
        Thread t = new Thread(() -> {
            try
            {
                Random r = new Random();
                for (int i = 0; i < 10; i++)
                {
                    Thread.sleep((long)r.nextInt(1500));
                    System.out.println("Número: " + i);

                }
            }
            catch (InterruptedException ie)
            {
                System.out.println("Se ha interrumpido el hilo.");
            }
        });
        t.start();

        //while (t.isAlive()) {} //Mientras este el hilo vivo, no hago nada. Aquí se está haciendo un gasto computacional tremenda, es una espera activa. Hace un uso intensivo de la CPU.
        //Para eso existe el método join
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ha finalizado el hilo.");

    }
}
