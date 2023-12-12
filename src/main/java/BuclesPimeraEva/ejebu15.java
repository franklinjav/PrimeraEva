package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num1 = teclado.nextInt();
        System.out.println("Introduzca otro número");
        int num2 = teclado.nextInt();
        int contador = 0;
        for (int i = 0; i < num2; i++) {
            contador = contador + num1;
        }
        System.out.println("El producto de su número es " + contador);
    }
}
