package BuclesPimeraEva;

import java.io.IOException;

public class ejebu29 {
    public static void main(String[] args) throws IOException {
        char letra = 'j';
        int cont = 0;
        while (letra != '.') {
            System.out.println("Introduzca una letra (si quiere salir del programa debe introducir .)");
            letra = (char) System.in.read();
            System.in.read();
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                cont++;
            }
        }
        System.out.println("Ha introducido " + cont + " vocales");
    }
}
