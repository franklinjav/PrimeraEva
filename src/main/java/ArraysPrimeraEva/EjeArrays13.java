package ArraysPrimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class EjeArrays13 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int num = -1;
        while (num <0 || num>32000) {
            System.out.println("Introduzca un números entre el 0 y el 32000");
            num = teclado.nextInt();
        }
        char lista[] = new char[4];
        for (int i = lista.length-1; i >= 0; i--) {
            int contador = num%16;
            if (contador<10) {
                lista[i] = (char) ('0' + contador);
            } else {
                lista[i] = (char) ('A' + contador-10);
            }
            num = num/16;
        }
        System.out.println("El número pasado a hexadecimal es:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
        }
    }
}

