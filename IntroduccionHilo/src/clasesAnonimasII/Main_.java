package clasesAnonimasII;

//Siguiendo el ejemplo del Main donde uso clase anonimas, pero lo hago aquí para lo liar el otro código.
//Eso se podría simplficar aun más.

import interfazRunnable.Tostadora;

public class Main_ {

    //La variable r que se usa para pasarla al constructor, como en el ejemplo del Main, podemos pasar de la siguiente manera desde new Runnable:
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {


                try {
                    System.out.println("Tostadas: Comenzamos a preparar las tostadas");
                    System.out.println("Tostadas: Ponemos el pan a tostar");
                    Thread.sleep(2000);
                    System.out.println("Tostadas: Echamos aceite");
                    Thread.sleep(2000);
                    System.out.println("Tostadas: Echamos sal");
                    Thread.sleep(2000);
                    System.out.println("Tostadas: Tostadas finalizadas");
                } catch (InterruptedException ie) {
                    System.out.println("Se ha interrumpido el hilo");

                }
            }
        });
        t.start();


        Thread t1 = new Thread(new Tostadora());
        t1.start(); //Aquí ya se puede ejecutar el star()
    }
}
