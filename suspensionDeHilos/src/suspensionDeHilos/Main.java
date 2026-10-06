package suspensionDeHilos;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) {

        //Metódo sleep. Ya conocido

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Método TimeUnit
        try {
            TimeUnit.SECONDS.sleep(2); //El TimeUnit hace lo mismo que el sleep, pero da mayor flexibilidad
        } catch (InterruptedException e) {    //Tiene varios métodos SECONDS, MILLISECONDS, ETC
            throw new RuntimeException(e);
        }

        //Método .yield: es un metodo de la clase Thread. Lo que hace es indicarle a la maquina virtual es que el hilo, donde se ha ejecutado esta llamada, esta dispuesto a suspenderse.
        //No esta haciendo una tarea importante. No se suspende como el sleep o TIMEUNIT.
        Thread.yield();

        //
    }
}
