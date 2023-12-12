package BuclesPimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class ejemploContadorPalabrasv2 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        char letra = 'p';
        boolean espacio = false;
        int cont = 0;
        System.out.println("Introduzca una frase para contar palabras");
        while (letra != 10 && letra != '.') {
            letra = (char) System.in.read();
            if (letra== ' ') {
                cont++;
                if (espacio) {
                    cont--;
                }
                espacio=true;
            } else {
                espacio=false;
            }
        }
        System.out.println("Ha introducido " + (cont+1) + " palabras");
    }
}
