package ArraysPrimeraEva;

public class EjeArrays5 {
    public static void main(String[] args) {
        int lista[][] = new int[5][5];
        for (int i = 0, h = lista.length-1; i < lista.length; i++, h--) {
            for (int j = 0, k = lista.length-1; j < lista.length; j++, k--) {
                if (i == j || h == j) {
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
