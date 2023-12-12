package ArraysPrimeraEva;

public class EjeArrays10 {
    public static void main(String[] args) {
        int lista[] = new int[10];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int)Math.floor(Math.random()*20);
            System.out.print(lista[i] + " ");
        }
        System.out.println();

        int cambio = lista[0];
        lista[0] = lista[lista.length-1];
        lista[lista.length-1] = cambio;

        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
    }
}
