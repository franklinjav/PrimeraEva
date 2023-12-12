package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numero1 = teclado.nextInt();
        System.out.println("Introduzca otro número");
        int numero2 = teclado.nextInt();
        if (numero2 > numero1) {
            for (int i = numero2; i >= numero1; i--) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("El primer número es mayor que el segundo");
        }
    }
}
