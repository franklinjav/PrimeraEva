package ArraysPrimeraEva;

public class OrdenarArrays {
    public static void main(String[] args) {
        int lista[] = new int[10];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int)Math.floor(Math.random()*20+1);
            System.out.print(lista[i] + " ");
        }
        boolean intercambio = true;
        for (int i = 0; i < lista.length && intercambio; i++) {
            intercambio = false;
            for (int j = 0; j < lista.length-1; j++) {
                if (lista[j] > lista[j+1]) {
                    int cambio = lista[j];
                    lista [j] = lista[j+1];
                    lista[j+1] = cambio;
                    intercambio = true;
                }
            }
        }
        System.out.println();
        System.out.println("La lista ordenada de menor a mayor es la siguiente: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
    }
}
