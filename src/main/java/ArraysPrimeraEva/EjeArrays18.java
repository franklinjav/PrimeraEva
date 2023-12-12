package ArraysPrimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class EjeArrays18 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        char stop[] = {'S','T','O','P'};
        char guia[] = new char[4];
        boolean marca = false;
        while (marca != true) {
            System.out.println("Introduzca una palabra");
            for (int i = 0; i < stop.length; i++) {
                guia[i] = (char) System.in.read();
            }
            for (int i = 0; i < stop.length; i++) {
                if (stop[i] == guia[i]) {
                    marca=true;
                } else {
                    marca=false;
                    i = stop.length;
                    System.in.read();
                }
            }
        }

    }
}
