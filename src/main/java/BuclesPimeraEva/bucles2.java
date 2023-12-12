package BuclesPimeraEva;

import java.util.Scanner;

public class bucles2 {
    public static void main(String[] args) {
        Scanner teclados = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numero = teclados.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
