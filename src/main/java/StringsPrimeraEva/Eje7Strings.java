package StringsPrimeraEva;

import java.util.Scanner;

public class Eje7Strings {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String lista[] = new String[5];

        //RELLENAR LA LISTA DE PALABRAS

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduzca una palabra");
            lista[i] = teclado.nextLine();
        }

        //SACAR LA LISTA SIN ORDENAR

        System.out.println("La lista de palabras sin ordenar alfabéticamente es:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------");

        //ORDENAR LA LISTA

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length-1; j++) {
                if (lista[j].compareTo(lista[j+1])>0) {
                    String aux = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = aux;
                }
            }
        }

        //SACAR LA LISTA ORDENADA DE MENOR A MAYOR

        System.out.println("La lista ordenada alfabéticamente de menor a mayor es:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
    }
}
