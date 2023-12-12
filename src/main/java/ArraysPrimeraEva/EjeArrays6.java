package ArraysPrimeraEva;

public class EjeArrays6 {
    public static void main(String[] args) {
        int datos [][] = new int[10][5];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                datos[i][j] = i;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
