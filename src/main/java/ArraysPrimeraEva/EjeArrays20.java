package ArraysPrimeraEva;

import java.io.IOException;

public class EjeArrays20 {
    public static void main(String[] args) throws IOException {
        System.out.println("Introduzcan un texto para pasarlo a mayúsculas");
        char letra = 'a';
        while (letra != 10) {
            letra = (char) System.in.read();
            if (letra == ' ') {
                System.out.print(letra);
            }
            if (letra >= 'A' && letra <= 'Z') {
                System.out.print(letra);
            }
            if (letra >= 'a' && letra <= 'z') {
                letra = (char) (letra - 32);
                System.out.print(letra);
            }
            
        }
    }
}
