package ArraysPrimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class EjeArrays21 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        char lista[] = new char[50];
        System.out.println("Introduzca un texto (máximo 50 caracteres contando los espacios)");
        char letra = 'a';
        int cont = 0;
        while (letra != 10 && cont < lista.length) {
            letra = (char) System.in.read();
            lista[cont] = letra;
            cont++;
        }
        System.out.println("Introduzca la cantidad de caracteres que desea obtener");
        int cantidad = teclado.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.print(lista[i]);
        }
    }
}
