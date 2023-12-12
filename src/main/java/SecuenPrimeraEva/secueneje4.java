package SecuenPrimeraEva;

import java.util.Scanner;

public class secueneje4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num = teclado.nextInt();
        System.out.println("El cuadrado de su número es: " + ((int) Math.pow(num,2)));
    }
}
