package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int resul = teclado.nextInt();
        for (int i = resul - 1; i >= 1; i--) {
             int facto = i * resul;
             resul = facto;
        }
        System.out.println("El factorial de su número es: " + resul);
    }
}
