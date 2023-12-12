package ArraysPrimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class EjeArrays15 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        char carac [] = new char[10];
        System.out.println("Introduzca 10 letras");
        for (int i = 0; i < carac.length; i++) {
            carac[i] = (char) System.in.read();
        }
        for (int i = 0; i < carac.length; i++) {
            if (carac[i] == 'A' || carac[i] == 'E' || carac[i] == 'I' || carac[i] == 'O' || carac[i] == 'U' || carac[i] == 'a' || carac[i] == 'e' || carac[i] == 'i' || carac[i] == 'o' || carac[i] == 'u') {
                carac[i] = '*';
            }
            System.out.print(carac[i] + " ");
        }
    }
}
