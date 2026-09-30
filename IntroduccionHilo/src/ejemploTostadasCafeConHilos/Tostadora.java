package ejemploTostadasCafeConHilos;

public class Tostadora extends Thread {

    @Override
    public void run() {

        //Aquí no se puede hacer el throws InterruptedException porque estamos heredando de la casa Thread,
        // no se puede modificar ni agregar parametros
        //Aquí si estamos obligados a hacer el try-catch

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
    }
}
