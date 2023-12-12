package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int n = teclado.nextInt();
        System.out.println("Introduzca otro número");
        int m = teclado.nextInt();
        System.out.println("Introduzca otro número");
        int y = teclado.nextInt();
        if (m >= n) {
            for (int i = m; i >= n; i = i - y) {
                System.out.print(i + " ");
            }
        } else {
            int cont = m;
            m = n;
            n = cont;
            for (int i = n; i <= m; i = i + y) {
                System.out.print(i + " ");
            }
        }
    }
}
