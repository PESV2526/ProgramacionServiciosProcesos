package informacionHilos2;

public class Main {
    public static void main(String[] args){
    //Hilo que saluda 5 veces
        Thread t = new Thread(()->{
            try{
                for(int i = 0; i < 5; i++)
                {
                    Thread.sleep(1000);
                    System.out.println("Hola, soy un hilo!");
                }
            }
            catch (InterruptedException ie)
            {
                System.out.println("Hilo interrumpido");
            }
        });

                t.start();

                //Para mostrar por pantalla un mensaje de despedida cuando acabe el hilo
        while(t.getState() != Thread.State.TERMINATED) //(t.isAlive()) -> menos código y hace lo mismo para este caso, pero hay mejores formas.
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Adiós!");

    }
}
