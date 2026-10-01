package ejercicios.ejercicio1.interfazRunnable;
import java.util.Random;

public class Contador implements Runnable
{
    private int n1;
    private int n2;

    public Contador(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    @Override
    public void run()
    {
        Random r = new Random();

        for(int i = n1; i <= n2; i++ )
        {
            System.out.println(i);
            try{
                Thread.sleep(r.nextInt(1000) + 1);
            }
            catch (InterruptedException e)
            {
                System.out.println("El hilo fue interrumpido.");
            }
        }
    }
}
