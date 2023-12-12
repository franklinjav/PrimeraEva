package StringsPrimeraEva;

import java.util.Scanner;

public class Eje5Strings {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una palabra o texto para que sea pasado a mayúsculas");
        String texto = teclado.nextLine();
        System.out.println("Su texto pasado a mayúsculas es: ");
        System.out.println(texto.toUpperCase());
    }
}
