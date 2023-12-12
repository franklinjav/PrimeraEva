package BuclesPimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class ejebu33 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        char letra = 'j';
        int cont = 0;
        while (letra != '.') {
            System.out.println("Introduzca una letra (el programa se detendrá al introducir 5 vocales o un .");
            System.out.println("De momento ha introducido " + cont + " vocales");
            letra = (char) System.in.read();
            System.in.read();
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' || letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cont++;
            }
            if (cont == 5) {
                letra = '.';
            }
        }
    }
}
