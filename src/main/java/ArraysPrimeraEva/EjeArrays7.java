package ArraysPrimeraEva;

public class EjeArrays7 {
    public static void main(String[] args) {
        int numeros[] = new int[30];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)Math.floor(Math.random()*20-10);
        }
        int contn = 0;
        int contp = 0;
        int contne = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                contp++;
            } else if (numeros[i] < 0) {
                contn++;
            } else {
                contne++;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ; ");
        }
        System.out.println();
        System.out.println("Hay " + contn + " números negativos");
        System.out.println("Hay " + contp + " números positivos");
        System.out.println("Hay " + contne + " números neutros");

    }
}
