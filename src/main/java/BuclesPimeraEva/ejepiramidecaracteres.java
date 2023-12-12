package BuclesPimeraEva;

import java.util.Scanner;

public class ejepiramidecaracteres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numero = teclado.nextInt();
        for (int i = 0; i < numero; i++) {
            char letra = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(letra);
                letra = (char) (letra + 1);
            }
            System.out.println();
        }
        for (int i = 0; i < numero; i++) {
            char letra = 'A';
            for (int j = i; j < numero - 1; j++) {
                System.out.print(letra);
                letra = (char) (letra + 1);
            }
            System.out.println();
        }
    }
}
