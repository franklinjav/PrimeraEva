package BuclesPimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class ejebu31 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        while (cont < 5) {
            System.out.println("Introduzca un caracter");
            char letra = (char) System.in.read();
            System.in.read();
            cont++;
        }
        System.out.println("Ya ha introducido 5 caracteres");
    }
}
