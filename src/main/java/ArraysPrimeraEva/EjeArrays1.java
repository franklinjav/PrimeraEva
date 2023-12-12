package ArraysPrimeraEva;

import java.util.Scanner;

public class EjeArrays1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lista [] = new int[15];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) Math.floor(Math.random()*20);
        }
        System.out.println("¿Cuántos números de la lista desea sumar?");
        int suma = teclado.nextInt();
        int total = 0;
        for (int i = 0; i < suma; i++) {
            total = total + lista[i];
        }
        System.out.println("La suma de los primeros " + suma + " números es: " + total);
        System.out.println("La lista es:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ; ");
        }
    }
}
