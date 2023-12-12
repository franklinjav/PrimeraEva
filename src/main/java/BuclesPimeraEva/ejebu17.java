package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de números que desea ver");
        int num = teclado.nextInt();
        int serie = 1;
        System.out.print(serie + " ");
        for (int i = 1; i < num; i++) {
            serie = serie * 2;
            System.out.print(serie + " ");
        }
    }
}
