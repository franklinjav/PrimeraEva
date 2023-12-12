package ArraysPrimeraEva;

public class ejemploRandoms {
    public static void main(String[] args) {
        int [] lista = new int[10];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random()*21);
            System.out.print(lista[i] + " ");
        }
        System.out.println();
        double [] lista2 = new double[10];
        for (int i = 0; i < lista2.length; i++) {
            lista2[i] = Math.round((Math.random()*21) * 100.0) / 100.0;
            System.out.print(lista2[i] + " ");
        }
    }
}
