package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de números que quiere introducir");
        int cant = teclado.nextInt();
        System.out.println("Introduzca un número");
        int menor = teclado.nextInt();
        for (int i = 0; i < cant-1; i++) {
            System.out.println("Introduzca un número");
            int num = teclado.nextInt();
            if (num <= menor) {
                menor = num;
            }
        }
        System.out.println("El número mas pequeño que ha introducido es " + menor);
    }
}
