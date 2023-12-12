package BuclesPimeraEva;

import java.util.Scanner;

public class ejepiramidesimbolos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numero = teclado.nextInt();
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j <= i; j++) {
                if (j%2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < numero; i++) {
            for (int j = numero - 1; j > i; j--) {
                if (j%2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
