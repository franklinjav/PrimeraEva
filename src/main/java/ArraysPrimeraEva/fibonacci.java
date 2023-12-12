package ArraysPrimeraEva;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de números de la serie de fibonacci que desea ver");
        int cant = teclado.nextInt();
        System.out.print("1 ");
        int fibo1 = 0;
        int fibo2 = 1;
        for (int i = 0; i < cant; i++) {
            System.out.print((fibo1+fibo2) + " ");
            int aux = fibo2;
            fibo2 = fibo1+fibo2;
            fibo1 = aux;
        }
    }
}
