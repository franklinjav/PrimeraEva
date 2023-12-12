package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sum = 0;
        while (sum <= 50) {
            System.out.println("Introduzca un número");
            int num = teclado.nextInt();
            sum = sum + num;
            System.out.println("La suma de los números es " + sum);
            System.out.println();
        }
    }
}
