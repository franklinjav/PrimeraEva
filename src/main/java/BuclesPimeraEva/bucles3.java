package BuclesPimeraEva;

import java.util.Scanner;

public class bucles3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numero = teclado.nextInt();
        int facto = 1;
        for (int i = numero; i > 0; i--) {
            facto = i * facto;
        }
        System.out.println("El factorial del número es " + facto);
    }
}
