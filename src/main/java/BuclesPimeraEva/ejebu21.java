package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int sum = 0;
        int cont = 0;
        do {
            System.out.println("Introduzca números para calcular la media, cuando introduzca un 0 se calculará");
            num = teclado.nextInt();
            sum = num + sum;
            cont++;
        }
        while (num != 0);
        System.out.println("La media es " + (sum/(cont-1)));
    }
}
