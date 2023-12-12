package ArraysPrimeraEva;

public class EjeArrays11 {
    public static void main(String[] args) {
        int lista[] = new int[10];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int)Math.floor(Math.random()*20);
            System.out.print(lista[i] + " ");
        }
        System.out.println();
        int cambio = 0;
        for (int i = 0, j = lista.length-1; i < j; i++, j--) {
            cambio = lista[i];
            lista[i] = lista[j];
            lista[j] = cambio;
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
    }
}
