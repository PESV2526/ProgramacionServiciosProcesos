package clasesAnonimasII;

public class Main {

    public static int contador = 1; //atributo contador de la clase Main

    public static void main(String[] args) {

        String texto = "elefantes(s) se balanceaban"; //variable local del método Main

        Thread t = new Thread (new Runnable() //Es interesante destacar que estamos declarando una clase anonima dentro de otra clase (Main)
                                              //Se dice que esta clase Runnable esta anidada dentro de la clase Main. Eso implica:
                                              //La clase anonima Runnable podra acceder a los atributos y metodos de la clase padre.
                                              // Y obtener el valor de las variables locales, pero no modificarlas.
        {
            @Override
            public void run()
            {
                while(contador <= 5)
                {
                    System.out.println(contador + "" + texto);
                    IncremetaContador();
                }
            }

        });
                t.start();
    }
    public static void IncremetaContador()
    {
        contador++;
    }
}

