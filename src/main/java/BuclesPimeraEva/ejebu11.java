package BuclesPimeraEva;

public class ejebu11 {
    public static void main(String[] args) {
        System.out.println("Los posibles resultados a la hora de tirar dos dados son:");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print(i + " y " + j + " | ");
            }
            System.out.println();
        }
    }
}
