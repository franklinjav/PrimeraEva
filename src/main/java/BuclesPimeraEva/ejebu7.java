package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números quiere introducir?");
        int cant = teclado.nextInt();
        int sum = 0;
        for (int i = 0; i < cant; i++) {
            System.out.println("Intoduzca un número (Ha introducido " + i + " números)");
            int num = teclado.nextInt();
            sum = num + sum;
        }
        System.out.println("La media de todos los números es de : " + sum/cant);
    }
}
