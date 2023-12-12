package StringsPrimeraEva;

import java.util.Scanner;

public class EjemploEqualsIgnoreCase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String color = "rojo";
        boolean verdad = false;
        System.out.println("Intente adivinar el color");
        while (verdad == false) {
            String color2 = teclado.nextLine();
            if (color.equalsIgnoreCase(color2)) {
                verdad = true;
                System.out.println("¡CORRECTO!");
            } else {
                System.out.println("Inténtalo nuevamente");
            }
        }
    }
}
