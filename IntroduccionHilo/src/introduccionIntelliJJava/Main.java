package introduccionIntelliJJava;

import java.util.Scanner;

//Intorducción a IntelliJ y Java

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese una línea: ");
        String l = sc.nextLine();

        System.out.println("El número introducido es: " + num);

        System.out.println("La línea introducida es: " + l);


    }
}
