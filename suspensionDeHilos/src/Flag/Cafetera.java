package Flag;

public class Cafetera implements Runnable {


    private int contador = 0;
    //Flag no deja de ser una variable. Con ella indicaremos si ha cambiado el estado de un hilo y detener la ejecución. Aquí usaremos un booleano.
    private boolean ejecutar = true;

    public void Detener(){ ejecutar = false; }
    public int getContador() { return contador; }

    @Override
    public void run() {
        try{
            //while(true) //recordamos que esto es una mala practica.
            while(ejecutar) //Mientras ejecutar sea true, se irán preparando cafés.
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
