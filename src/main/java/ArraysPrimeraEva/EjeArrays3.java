package ArraysPrimeraEva;

import java.util.Scanner;

public class EjeArrays3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lista[] = new int[15];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduzca 15 números, de momento ha introducido " + i + " números");
            lista[i] = teclado.nextInt();
        }
        System.out.println("La lista que ha introducido es:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ; ");
        }
        System.out.println();
        System.out.println("La lista de números que ha introducido en orden inverso es");
        for (int i = lista.length-1; i >= 0; i--) {
            System.out.print(lista[i] + " ; ");
        }
    }
}
