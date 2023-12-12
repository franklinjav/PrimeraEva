package ArraysPrimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class EjeArrays16 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una palabra");
        char lista [] = new char[45];
        char letra = 'a';
        int cont = 0;
        for (int i = 0; i < lista.length && letra != 10; i++) {
            letra = (char) System.in.read();
            lista[i] = letra;
            cont = i;
        }
        char palindromo[] = new char[cont];
        char palindromo2[] = new char[cont];
        for (int i = 0; i < palindromo.length; i++) {
            palindromo[i] = lista[i];
        }
        for (int i = palindromo2.length-1, j = 0; i >= 0; i--, j++) {
            palindromo2[j] = palindromo[i];
        }
        boolean prueba = true;
        for (int i = 0; i < palindromo.length; i++) {
            if (palindromo[i] != palindromo2[i]) {
                prueba = false;
            }
        }
        if (prueba==false || palindromo.length == 1) {
            System.out.println("Su palabra no es un palíndromo");
        } else {
            System.out.println("Su palabra es un palíndromo");
        }
        //esto es para probar que los arrays se ordenan de forma correcta
        /*for (int i = 0; i < palindromo.length; i++) {
            System.out.print(palindromo[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < palindromo2.length; i++) {
            System.out.print(palindromo2[i] + " ");
        }*/
    }
}
