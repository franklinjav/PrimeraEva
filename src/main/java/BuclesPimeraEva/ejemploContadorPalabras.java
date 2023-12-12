package BuclesPimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class ejemploContadorPalabras {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        char letra = 'p';
       // char letra2 = 'p';
        System.out.println("Introduzca una frase (debe acabar en .)");
        while (letra != '.') {
            letra = (char) System.in.read();
            if (letra == ' ') {
                contador++;
                //letra2 = letra;
            }
        }
        System.out.println("Ha introducido " + (contador + 1) + " palabras");
    }
}
