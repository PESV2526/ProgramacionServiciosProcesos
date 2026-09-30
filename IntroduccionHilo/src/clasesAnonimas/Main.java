package clasesAnonimas;

//La ventaja del uso de las clases anonimas es que no tenemos que tenerla en un archivo diferente
//Sino que podemos definir e instanciar la clase desde el propio metodo Main
//Este tipo de clases solo la podemos usar cuando vayamos a implementar uan clase abstracta o interfaz.

import interfazRunnable.Tostadora;

public class Main {
    public static void main(String[] args) {
        Runnable r = new Runnable() { //Aquí parece que estamos instanciando una interfaz, pero no, hay que recordar
                                      //que en ningun lenguaje de programacion podemos crear una instancia de una interfaz.
                                      //Internamente lo que ocurre es que Java lo asume como que queremos usar una clase anonima.
                                      //Ventajas: no es necesario tener varios archivos, pero para una clase que solo voy a instanciar una vez, no es un mal uso.
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
        };






    }
}
