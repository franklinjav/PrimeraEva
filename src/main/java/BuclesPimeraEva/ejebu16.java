package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número (base)");
        int base = teclado.nextInt();
        System.out.println("Introduzca un número (exponente)");
        int expo = teclado.nextInt();
        int resultado = base;
        if (expo == 0) {
            resultado = 1;
        } else if (expo == 1) {
            resultado = base;
        } else {
                for (int i = 1; i < expo; i++) {
                    resultado = resultado * base;
                }
        }
        System.out.println("La potencia es " + resultado);
    }
}
