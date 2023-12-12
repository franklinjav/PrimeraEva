package ArraysPrimeraEva;

import java.util.Scanner;

public class EjeArrays8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numeros [] = new double[20];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca 20 números, de momento ha introducido " + i + " números");
            numeros[i] = teclado.nextDouble();
        }
        double max = numeros[0];
        int posi = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
                posi = i;
            }
        }
        System.out.println("El valor máximo es: " + max);
        System.out.println();
        System.out.println("La posición que ocupa es: " + (posi+1));
    }
}
