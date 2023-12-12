package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        while (num != 10 && num != -10) {
            System.out.println("Introduzca un número positivo, si desea salir debe introducir 10 o -10");
            num = teclado.nextInt();
            if (num > 0 && num != 10) {
                suma = num + suma;
            }
        }
        System.out.println("La suma de los números positivos que ha introducido es de " + suma);
    }
}
