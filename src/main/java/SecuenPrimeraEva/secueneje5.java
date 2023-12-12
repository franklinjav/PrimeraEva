package SecuenPrimeraEva;

import java.util.Scanner;

public class secueneje5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el valor del primer cateto");
        float cateto1 = teclado.nextFloat();
        System.out.println("Introduzca el valor del segundo cateto");
        float cateto2 = teclado.nextFloat();
        System.out.println("La hipotenusa es: " + (Math.hypot(cateto1,cateto2)));
    }
}
