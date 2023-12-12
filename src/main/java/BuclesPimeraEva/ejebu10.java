package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números quiere introducir");
        int cant_num = teclado.nextInt();
        int cont_par = 0;
        int cont_imp = 0;
        for (int i = 0; i < cant_num; i++) {
            System.out.println("Introduzca un número (ha introducido " + i + " números)");
            int num = teclado.nextInt();
            if (num%2==0) {
                cont_par++;
            } else {
                cont_imp++;
            }
        }
        System.out.println("Ha introducido " + cont_par + " números pares y " + cont_imp + " números impares");
    }
}
