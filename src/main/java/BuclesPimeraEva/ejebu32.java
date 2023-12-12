package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        while (suma <= 30) {
            System.out.println("Introduzca un número (el programa se detendrá cuando la suma de los números que ha introducido que sean divisibles entre 6 y 3 supere 30)");
            int num = teclado.nextInt();
            if (num%6 == 0 && num%3 == 0) {
                suma = suma + num;
            }
        }
        System.out.println("La suma de los números es " + suma);
    }
}
