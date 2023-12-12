package BuclesPimeraEva;

public class PiramideEjemplo {
    public static void main(String[] args) {
        int n = 10; // Número de filas de la pirámide

        for (int i = 1; i <= n; i++) {
            // Espacios en blanco a la izquierda
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Números ascendentes
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j % 10);
            }

            // Números descendentes
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j % 10);
            }

            System.out.println(); // Nueva línea para la siguiente fila
        }
    }
}
