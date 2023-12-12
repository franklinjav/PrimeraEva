package SecuenPrimeraEva;

import java.util.Scanner;

public class secueneje3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int a = teclado.nextInt();
        System.out.println("Introduzca un número");
        int b = teclado.nextInt();
        System.out.println("Introduzca un número");
        int c = teclado.nextInt();
        int d = (a+b)/c;
        System.out.println("(primer número + segundo número) / tercer número = " + d);
    }
}
