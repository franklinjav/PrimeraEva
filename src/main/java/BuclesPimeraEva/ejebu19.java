package BuclesPimeraEva;

import java.util.Scanner;

public class ejebu19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int countp = 0;
        int countn = 0;
        int countneutro = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce un número, ha introducido " + i + " números");
            int num = teclado.nextInt();
            if (num < 0) {
                countn++;
            } else if (num == 0) {
                countneutro++;
            } else {
                countp++;
            }
        }
        System.out.println("Ha introducido " + countp + " números positivos" + ", " + countneutro + " ceros y " + countn + " números negativos");
    }
}
