package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean perfecto = false;
        while (perfecto == false) {
            System.out.println("Introduzca un número para saber si es perfecto");
            int num = teclado.nextInt();
            int sum = 0;
            for (int i = num-1; i > 0; i--) {
                if (num%i==0) {
                    sum = sum + i;
                }
            }
            if (sum == num) {
                System.out.println("Su número es perfecto");
                perfecto = true;
            } else {
                System.out.println("Este número no es perfecto");
            }
        }
    }
}
