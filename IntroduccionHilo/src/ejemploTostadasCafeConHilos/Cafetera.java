package ejemploTostadasCafeConHilos;

public class Cafetera extends Thread {

    @Override
    public void run() {

        //Aquí no se puede hacer el throws InterruptedException porque estamos heredando de la casa Thread,
        // no se puede modificar ni agregar parametros
        //Aquí si estamos obligados a hacer el try-catch

        try{
            System.out.println("Tostadas: Comenzamos a preparar las tostadas");
            System.out.println("Tostadas: Ponemos el pan a tostar");
            Thread.sleep(2000);
            System.out.println("Tostadas: Echamos aceite");
            Thread.sleep(2000);
            System.out.println("Tostadas: Echamos sal");
            Thread.sleep(2000);
            System.out.println("Tostadas: Tostadas finalizadas");
        }

        catch (InterruptedException ie) {
            System.out.println("Se ha interrumpido el hilo");

        }
    }
}
