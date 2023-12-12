package BuclesPimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class ejemploRandomAcertar {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int adivinar = (int) Math.floor(Math.random()*10 + 1);
        int num = 20;
        int contador = 0;
        while (num != adivinar && contador < 3) {
            System.out.println("Introduzca un número entre el 1 y el 10");
            num = teclado.nextInt();
            if (num != adivinar) {
                contador++;
                System.out.println("Llevas " + contador + " intentos");
            } else {
                System.out.println("Has acertado.");
            }
        }
        if (contador == 3) {
            System.out.println("Has alcanzado el número máximo de intentos.");
        }
    }
}
