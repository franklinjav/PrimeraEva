package StringsPrimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class Eje4Strings {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        StringBuilder cons = new StringBuilder();
        boolean palin = false;
        System.out.println("Introduzca una palabra para saber si es un palíndromo");
        while (palin == false) {
            String palabra = teclado.nextLine();
            cons.append(palabra);
            cons.reverse();
            if (palabra.equalsIgnoreCase(String.valueOf(cons))) {
                System.out.println("Su palabra es un palíndromo");
                palin = true;
            } else {
                System.out.println("Su palabra no es un palíndromo, inténtalo nuevamente");
                cons.setLength(0);
            }
        }
    }
}
