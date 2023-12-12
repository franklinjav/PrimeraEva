package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de número que desea ver en la serie de Fibonacci");
        int num = teclado.nextInt();
        int fibo1 = 0;
        int fibo2 = 1;
        System.out.print(fibo2 + " ");
        for (int i = 0; i < num; i++) {
            int fibo3 = fibo1 + fibo2;
            System.out.print(fibo3 + " ");
            fibo1 = fibo2;
            fibo2 = fibo3;
        }
    }
}
