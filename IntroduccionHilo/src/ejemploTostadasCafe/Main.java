package ejemploTostadasCafe;

public class Main {
    public static void main(String[] args) {
        try {
            PrepararTostadas();
            PrapararCafe();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //Métodos
    //Este programa tarde 12 segundos en ejecutarse y lo hace de manera secuencial.

    public static void PrepararTostadas() throws InterruptedException {
        System.out.println("Tostadas: Comenzamos a preparar las tostadas");
        System.out.println("Tostadas: Ponemos el pan a tostar");
        //
        //LLamada a método Sleep que detendrá el progrmaa 2000 milisegundos.
        //Sleep es un método estatico de la clase Thread, no tenemos que crear un objeto de la clase.
        //Lo usaremos para simular las esperas de los programas cuando tienen que hacer operaciones complicadas.

        Thread.sleep(2000);
        System.out.println("Tostadas: Echamos aceite");
        Thread.sleep(2000);
        System.out.println("Tostadas: Echamos sal");
        Thread.sleep(2000);
        System.out.println("Tostadas: Tostadas finalizadas");
    }

    //Sobre el throws InterruptedException: con la llamada del método sleep de la clase Thread, es posible que
    //se lance una excepción, Java obliga o a encerrar el método en try-catch o a indicar en el método el throws InterruptedException
    //Al colocar el throws InterruptedException ya no obliga a colocar en cada llamada del método el try-catch
    //Lo que si se hace es usar el try-catch en el método principal(Main) esto viene bien para no llenar los otros métodos de try-catch

    public static void PrapararCafe() throws InterruptedException {
        System.out.println("Café: Comenzamos a preparar el café");
        System.out.println("Café: Ponemos la cafetera");
        Thread.sleep(2000);
        System.out.println("Café: Servimos el café en la taza");
        Thread.sleep(2000);
        System.out.println("Café: Echamos la leche");
        Thread.sleep(2000);
        System.out.println("Café: Café finalizado");
    }
}
