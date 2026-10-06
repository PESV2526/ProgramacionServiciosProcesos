package Ejercicios.Ejercicio4;

public class Contador implements Runnable {
    private int contador = 0;
    private boolean ejecutar = true;

    public int getContador() {
        return contador;
    }
    public void Detener()
    {
        ejecutar = false;
    }

    @Override
    public void run()
    {
        try
        {
            while(ejecutar)
            {
                contador++;
                if(contador <= 5)
                {
                    System.out.println(contador);
                }
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException ie)
        {
            System.out.println("Interrupted");
        }

    }
}
