package ArraysPrimeraEva;

public class EjeArrays4 {
    public static void main(String[] args) {
        int lista [][] = new int[10][10];
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (i%2 == 0) {
                    lista[i][j] = 0;
                } else {
                    lista[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                System.out.print(lista[i][j]);
            }
            System.out.println();
        }
    }
}
