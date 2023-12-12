package BuclesPimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class ejemploContadorLetras {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        char letra = 'a';
        System.out.println("Introduzca una frase (debe acabar el .)");
        while (letra != '.') {
            letra = (char) System.in.read();
            if (letra >= 65 && letra <= 90 || letra >= 97 && letra <= 122) {
                contador++;
            }
        }
        System.out.println("Ha introducido " + contador + " letras");
    }
}
