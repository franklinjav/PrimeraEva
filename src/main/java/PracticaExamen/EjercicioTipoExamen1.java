package PracticaExamen;

import java.io.IOException;
import java.util.Scanner;

public class EjercicioTipoExamen1 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        char opcion = 'j';
        while (opcion != 'C') {
            System.out.println("Introduzca A para sumar números primos. Introduzca B para pasar una frase o palaba de minúsculas a mayúsculas. Introduzca C para salir.");
            opcion = (char) System.in.read();
            System.in.read();
            switch (opcion) {
                case 'A':
                    int num = 0;
                    int sum = 0;
                    while (num != 1 && num != -1) {
                        System.out.println("Introduzca un número, si es primo se sumarán. Para salir debe introducir 1 o -1");
                        num = teclado.nextInt();
                        boolean verdad = true;
                        for (int i = num-1; i > 1 && verdad != false; i--) {
                            if (num%i == 0) {
                                verdad = false;
                                System.out.println("Este número no es primo");
                            }
                        }
                        if (num != 1 && num != -1 && verdad == true) {
                            sum = sum + num;
                        }
                    }
                    System.out.println("La suma de los números primos es de " + sum);
                    break;
                case 'B':
                    char letra = 'a';
                    System.out.println("Introduzca una frase o palabra");
                    while (letra != 10) {
                        letra = (char) System.in.read();
                        if (letra > 96 && letra < 123) {
                            letra = (char) (letra - 32);
                            System.out.print(letra);
                        } else {
                            System.out.print(letra);
                        }
                    }
                    break;
                case 'C':
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("No ha introducido una opción válida");
                    break;
            }
        }
    }
}
