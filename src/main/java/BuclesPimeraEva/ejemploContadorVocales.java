package BuclesPimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class ejemploContadorVocales {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        char letra = 'a';
        System.out.println("Introduzca una frase (debe acabar el .)");
        while (letra != '.') {
            letra = (char) System.in.read();
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' || letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        System.out.println("Ha introducido " + contador + " vocales");
    }
}