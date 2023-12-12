package SecuenPrimeraEva;

import java.util.Scanner;

public class secueneje2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        int precio = teclado.nextInt();
        System.out.println("Introduce la cantidad del producto");
        int cant = teclado.nextInt();
        System.out.println("La cantidad que debe pagar es " + (precio*cant));
    }
}
