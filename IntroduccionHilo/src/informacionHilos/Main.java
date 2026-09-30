package informacionHilos;

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
                //Estos metodos son de la clase Thread

                //Devuelve un identificador hilo. No es modificable y se crea cuando se ejcuta el hilo
                System.out.println("ID: " + t.getId());

                //Devuelve el nombre del hilo, si es modificable.
                System.out.println("Nombre: " + t.getName());

                //Con el siguente metodo se puede cambiar el nombre de un hilo
                t.setName("Hilo 1");

                //Devuelve la prioridad del hilo. Es un numero que va del 1 al 10
                //Podemos cambiar esta prioridad
                //La prioridad por defecto es 5, si no se le asigna una prioridad.
                System.out.println("Prioridad: " + t.getPriority());
                //Para cambiar esta prioridad
                t.setPriority(Thread.MIN_PRIORITY);

                //El estado en el que se encuentra el hilo. Devuelve un enumerado. NEW, RUNNABLE, BLOCK, WAITING, TIME_WAITING, TERMINATED
                System.out.println("Estado: " + t.getState());

                //Devuelve un booleano que dice si el hilo esta vivo o no, es decir, si ha terminado de jecutar sus instrucciones o no.
                System.out.println("Está vivo: " + t.isAlive());
    }
}
