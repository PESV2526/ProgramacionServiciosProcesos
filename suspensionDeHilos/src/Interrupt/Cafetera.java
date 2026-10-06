package Interrupt;

public class Cafetera implements Runnable {

    private int contador = 0;
    public int getContador() { return contador; }

    @Override
    public void run() {
        try{

            while(!Thread.currentThread().isInterrupted())
                //Mientras no esté interrumpido. El while dentro del try
                //Si la interrupcion la ha gestionado un metodo sleep, wait o join lanzando una excepcion el isInterrupted va a devolver false
            {
                //Comenzamos a preparar el cafe
                //Ponemos la cafetera
                Thread.sleep(200);
                //Servimos el cafe en la taza
                Thread.sleep(200);
                //Echamos la leche
                Thread.sleep(200);
                //Café finalizado
                contador++;
                System.out.println("Número de cafés preparados: " + contador);
            }
        }
        catch (InterruptedException ie)
        {
            System.out.println("Hilo interrumpido.");
        }
    }
}
