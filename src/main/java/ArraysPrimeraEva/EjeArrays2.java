package ArraysPrimeraEva;

public class EjeArrays2 {
    public static void main(String[] args) {
        int origen[] = {10,25,26,40,37,45,90,76,78,81,58,32};
        int cont = 0;
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] > 25 && origen[i]%2 == 0) {
                cont++;
            }
        }
        int destino[] = new int[cont];
        int corigen = 0;
        int cdestino = 0;
        while (corigen < origen.length) {
            if (origen[corigen] > 25 && origen[corigen]%2 == 0) {
                destino[cdestino] = origen[corigen];
                cdestino++;
            }
            corigen++;
        }
        System.out.println("El array origen es:");
        for (int k = 0; k < origen.length; k++) {
            System.out.print(origen[k] + " ; ");
        }
        System.out.println();
        System.out.println("El array destino es:");
        for (int k = 0; k < destino.length; k++) {
            System.out.print(destino[k] + " ; ");
        }
    }
}
