package BuclesPimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class ejebu23 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        char letra = 'a';
        System.out.println("Introduzca una frase (debe acabar en .)");
        while (letra != '.') {
            letra = (char) System.in.read();
            if (letra == ' ') {
                cont++;
            }
        }
        System.out.println("Ha introducido " + (cont+1) + " palabras");
    }
}
