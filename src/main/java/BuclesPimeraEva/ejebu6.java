package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num = teclado.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + i*num);
        }
    }
}
