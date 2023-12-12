package PracticaExamen;


public class EjercicioTipoExamen3 {
    public static void main(String[] args) {
        double gasto [][] = new double[10][7];
        for (int i = 0; i < 10; i++) {
            System.out.println("Cliente " + (i+1));
            for (int j = 0; j < 7; j++) {
                gasto[i][j] = Math.round((Math.random() * 195 + 5) * 100.0) / 100.0;
                System.out.print(gasto[i][j] + "€  ");
            }
            System.out.println();
        }
        double suml = 0, summ = 0,summi = 0, sumj = 0,sumv = 0, sums = 0, sumd = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 0) {
                    suml = suml + gasto[i][j];
                }
                if (j == 1) {
                    summ = summ + gasto[i][j];
                }
                if (j == 2) {
                    summi = summi + gasto[i][j];
                }
                if (j == 3) {
                    sumj = sumj + gasto[i][j];
                }
                if (j == 4) {
                    sumv = sumv + gasto[i][j];
                }
                if (j == 5) {
                    sums = sums + gasto[i][j];
                }
                if (j == 6) {
                    sumd = sumd + gasto[i][j];
                }
            }
        }
        System.out.println("------------------------------------------------");
        System.out.println("La media de gastos de los lunes es de " + Math.round((suml/10)*100.0) / 100.0 + "€");
        System.out.println("La media de gastos de los martes es de " + Math.round((summ/10)*100.0) / 100.0 + "€");
        System.out.println("La media de gastos de los miercoles es de " + Math.round((summi/10)*100.0) / 100.0 + "€");
        System.out.println("La media de gastos de los jueves es de " + Math.round((sumj/10)*100.0) / 100.0 + "€");
        System.out.println("La media de gastos de los viernes es de " + Math.round((sumv/10)*100.0) / 100.0 + "€");
        System.out.println("La media de gastos de los sabado es de " + Math.round((sums/10)*100.0) / 100.0 + "€");
        System.out.println("La media de gastos de los domingo es de " + Math.round((sumd/10)*100.0) / 100.0 + "€");
        System.out.println("------------------------------------------------");

        double[] sumcli = {0,0,0,0,0,0,0,0,0,0};
        double[] sumcliorden = {0,0,0,0,0,0,0,0,0,0};

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                sumcli[i] = gasto[i][j] + sumcli[i];
                sumcliorden[i] = sumcli[i];
            }
        }
        for (int i = 0; i < sumcli.length; i++) {
            System.out.println("La suma del cliente " + (i+1) + " es: " + Math.round((sumcli[i])*100.0) / 100.0 + "€");
        }
        System.out.println("------------------------------------------------");

        int top3 [] = new int[3];
        double top3cant [] = new double[3];
        boolean parar = true;
        for (int i = 0; i < sumcliorden.length && parar; i++) {
            parar=false;
            for (int j = 0; j < sumcliorden.length-1; j++) {
                if (sumcliorden[j] < sumcliorden[j+1]) {
                    double aux = sumcliorden[j+1];
                    sumcliorden[j+1] = sumcliorden[j];
                    sumcliorden[j] = aux;
                    parar=true;
                }
            }
        }
        /*
        ESTO ES PARA VERIFICAR QUE SE ORDENA DE FORMA CORRECTA
        for (int i = 0; i < sumcliorden.length; i++) {
            System.out.print(sumcliorden[i] + " ");
        }

         */
        for (int i = 0; i < top3.length; i++) {
            for (int j = 0; j < sumcli.length; j++) {
                if (sumcliorden[i] == sumcli[j]) {
                    top3[i] = j;
                    top3cant[i] = sumcli[j];
                }
            }
        }
        System.out.println("El top 3 de clientes que más han gastado ha sido el siguiente:");
        for (int i = 0; i < top3.length; i++) {
            System.out.println("El top " + (i+1) + " es el cliente " + (top3[i]+1) + " con " + Math.round(top3cant[i]*100.0)/100.0 + "€");
        }
    }
}
