package SecuenPrimeraEva;

import java.util.Scanner;

public class secueneje6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduca la cantidad de Euros");
        double cantidadEuros = teclado.nextDouble();

        int billetes10 = (int) (cantidadEuros / 10);
        cantidadEuros = cantidadEuros%10;

        int billetes5 = (int) (cantidadEuros / 5);
        cantidadEuros = cantidadEuros%5;

        int monedas50 = (int) (cantidadEuros / 0.5);
        cantidadEuros = cantidadEuros%0.5;

        int monedas10 = (int) (cantidadEuros / 0.1);
        cantidadEuros = cantidadEuros%0.1;

        int monedas5 = (int) (cantidadEuros / 0.05);
        cantidadEuros = cantidadEuros%0.05;

        int monedas1 = (int) (cantidadEuros / 0.01);

        System.out.println("Billetes de 10 euros: " + billetes10);
        System.out.println("Billetes de 5 euros: " + billetes5);
        System.out.println("Monedas de 50 céntimos: " + monedas50);
        System.out.println("Monedas de 10 céntimos: " + monedas10);
        System.out.println("Monedas de 5 céntimos: " + monedas5);
        System.out.println("Monedas de 1 céntimo: " + monedas1);

    }
}
