package StringsPrimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class practicaDeToCharArray {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        boolean condi = true;
        System.out.println("Introduzca su correo electrónico");
        while (condi) {
            String mail = teclado.nextLine();
            char[] verificar = mail.toCharArray();
            boolean salir = true;
            for (int i = 0; i < verificar.length && salir; i++) {
                if (verificar[i] == '@') {
                    condi = false;
                    salir = false;
                }
            }
            if (condi) {
                System.out.println("No ha introducido un correo válido. Inténtelo nuevamente");
            }
        }
    }
}
