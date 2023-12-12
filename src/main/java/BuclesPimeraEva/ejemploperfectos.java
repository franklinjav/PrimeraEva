package BuclesPimeraEva;

import java.util.Scanner;

public class ejemploperfectos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un número");
        int numero = teclado.nextInt();
        int cont_per = 0;
        for (int i = numero - 1; i > 0; i--) {
            if (numero%i == 0) {
                cont_per = cont_per + i;
            }
        }
        if (cont_per == numero) {
            System.out.println("Su número es perfecto");
        } else {
            System.out.println("Su número no es perfecto");
        }
    }
}
