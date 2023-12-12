package StringsPrimeraEva;

import java.util.Scanner;

public class Eje6Strings {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una palabra o texto");
        String texto = teclado.nextLine();
        System.out.println("Introduzca la cantidad de carácteres que desea ver de izquierda a derecha");
        int cant = teclado.nextInt();
        System.out.println("El texto queda de la siguiente manera");
        System.out.println(texto.substring(0,cant));
    }
}
