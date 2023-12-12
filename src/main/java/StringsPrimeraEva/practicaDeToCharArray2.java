package StringsPrimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class practicaDeToCharArray2 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String frase = teclado.nextLine();
        char[] lista = frase.toCharArray();
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
        }
    }
}
