package expresionesLambda;

//Las expresiones lambda vienen del paradigma de programación funcional.
//Basicamente nos permite pasar una funcion como parametro de otra funcion.
//Con esta funcionalidad los metodos podrán recibir métodos por parametros.
//Una expresion lambda no es mas que un bloque de codigo que recibe parametros y devuelve un valor.
//La unica diferencia qes que no tendra un nombre o identificador. Y ademas, lo podremos definir alla donde lo necesitemos.
//Por ejemplo, a la hora de llamar a un metodo. Si tenemos un metodo que recibe como parametro un objeto que implemente una interfaz, ahi se podra usar la expresion lambda.

public class Main {

    public static void main(String[] args) {

            //El constructor Thread espera que se le pase por parametro algo que implmente la interfaz Runnable o cualquie interfaz.
            //Hay que tener en cuenta que la interfaz debe tener solo un metodo por implementar, en este caso se cumple porque Runnable solo implmenta el método run.
            //También es importante destacar que ocurre lo mismo con las clases annimas,
            // de dentro de una expresion lambda podremos acceder (leer y modificar) a los atributos  de la clase padre
            //con las variables locales sigue pasando lo mismo, se leen, pero no se pueden modificar.

        Thread t = new Thread(()->{
            try{
                System.out.println("Café: Comenzamos a preparar el café");
                System.out.println("Café: Ponemos la cafetera");
                Thread.sleep(2000);
                System.out.println("Café: Servimos el café en la taza");
                Thread.sleep(2000);
                System.out.println("Café: Echamos la leche");
                Thread.sleep(2000);
                System.out.println("Café: Café finalizado");
            }
            catch (InterruptedException ie) {
                System.out.println("Se ha interrumpido el hilo");
            }
        });
        t.start();

    }
}
