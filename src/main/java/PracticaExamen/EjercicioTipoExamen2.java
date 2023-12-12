package PracticaExamen;

import java.io.IOException;
import java.util.Scanner;

public class EjercicioTipoExamen2 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca su apellido");
        String apellido = teclado.nextLine();
        System.out.println("Introduzca su segundo apellido");
        String apellido2 = teclado.nextLine();
        System.out.println("Introduzca su DNI");
        String dni = teclado.nextLine();
        System.out.println(nombre.charAt(0) + apellido.substring(0,3) + apellido2.substring(0,3) + dni.substring(5,8));
    }
}
