package ArraysPrimeraEva;

public class EjeArrays9 {
    public static void main(String[] args) {
        int lista[] = new int[10];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) Math.floor(Math.random()*20);
        }
        int sum = 0;
        for (int i = 0; i < lista.length; i++) {
            if (i%2 == 0) {
                sum = sum + lista[i];
            }
            System.out.print(lista[i] + " ");
        }
        System.out.println();
        System.out.println("La suma de los números pares de la lista es: " + sum);
    }
}
