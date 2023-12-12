package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        int num = 0;
        int mayor = 0;
        while (num >= 0) {
            System.out.println("Introduzca números positivos. Para salir introduzca un número negativo");
            num = teclado.nextInt();
            if (num >= mayor) {
                mayor = num;
            }
            cont++;
        }
        System.out.println("Ha introducido " + cont + " números de los cuales el mayor es " + mayor);
    }
}
