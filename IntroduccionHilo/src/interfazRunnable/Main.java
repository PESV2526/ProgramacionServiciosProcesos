package interfazRunnable;

public class Main {
    public static void main(String[] args) {

       // Tostadora t = new Tostadora(); //creamos la instancia de la clase Tostadora
        //t.start(); //esto ejecutará el hilo ->Esto dará error si en la clase Tostadora he implementado Runnable
                   //porque el método start() es de la clase Thread

        //Debo declarar un objeto de tipo Thread y entre parentesis un objeto que implemente la interfaz Runnable
        Thread t = new Thread(new Tostadora());
        t.start(); //Aquí ya se puede ejecutar el star()

        //Comentamos para aplicar con la interfaz Runnable
        //Cafetera c = new Cafetera();
        //c.start();

        Thread t2 = new Thread(new Cafetera());
        t2.start();

        //En Java, las clases solo pueden heredar de una clase
        //A lo largo de estos temas usaremos por preferencia la interfaz Runnable
    }
}
