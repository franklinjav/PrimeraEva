package ArraysPrimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class EjeArrays17 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un texto para contar el número de palabras");
        char letra;
        boolean prueba = true;
        int cont = 0;
        do {
            letra = (char) System.in.read();
            if (letra != ' ') {
                prueba = true;
            }
            if (letra == ' ' && prueba == true) {
                cont++;
            }
            if (letra == ' ') {
                prueba = false;
            }
        } while (letra != 10);
        System.out.println("La cantidad de palabras es de " + (cont+1));
    }
}
