package Trabajoentornos;

import java.io.IOException;
import java.util.Scanner;

public class TrabajoEntornosFranklinYOscar {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int env = 0;
        int rec = 0;
        float tpi = 10;
        float tpn = 5;
        float tmi = 20;
        float tmn = 10;
        float tgi = 40;
        float tgn = 20;
        do {
            System.out.println("Introduzca una 1 Para acceder como cliente 2 Para acceder como empleado y 3 Para salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    char letra = 'a';
                    do {
                        System.out.println("Introduzca A para enviar, B para recoger y C para salir");
                        letra = (char) System.in.read();
                        System.in.read();
                        switch (letra) {
                            case 'A':
                                env++;
                                System.out.println("Introduzca el peso (en kg) de su paquete");
                                float peso = teclado.nextFloat();
                                int tipo = 8;
                                int tamaño = 8;
                                int velocidad = 0;
                                float total = 0;
                                while (tipo != 1 && tipo != 2) {
                                    System.out.println("Introduzca 1 si su paquete es para envío nacional y 2 si es para envío internacional");
                                    tipo = teclado.nextInt();
                                    if (tipo != 1 && tipo != 2) {
                                        System.out.println("La opción que ha introducido no es válida");
                                    }
                                }
                                while (tamaño != 1 && tamaño != 2 && tamaño != 3) {
                                    System.out.println("Introduzca 1 si su paquete es pequeño 2 si su paquete es mediano y 3 si su paquete es grande");
                                    tamaño = teclado.nextInt();
                                    if (tamaño != 1 && tamaño != 2 && tamaño != 3) {
                                        System.out.println("La opción que ha introducido no es válida");
                                    }
                                }
                                while (velocidad != 1 && velocidad != 2) {
                                    System.out.println("Introduzca 1 si quiere que su envío sea rápido (+5 EUR) y 2 si quiere que su envío sea estándar");
                                    velocidad = teclado.nextInt();
                                    if (velocidad == 1 && velocidad == 2) {
                                        System.out.println("La opción que ha introducido no es válida");
                                    }
                                }
                                if (velocidad == 1) {
                                    total = total + 5;
                                }
                                if (tipo == 1) {
                                    if (tamaño == 1) {
                                        System.out.println("El total de su envío es: " + (total+tpn+((int)peso*2)) + " EUR");
                                    }
                                    if (tamaño == 2) {
                                        System.out.println("El total de su envío es: " + (total+tmn+((int)peso*2)) + " EUR");
                                    }
                                    if (tamaño == 3) {
                                        System.out.println("El total de su envío es: " + (total+tgn+((int)peso*2)) + " EUR");
                                    }
                                } else {
                                    if (tamaño == 1) {
                                        System.out.println("El total de su envío es: " + (total+tpi+((int)peso*2)) + " EUR");
                                    }
                                    if (tamaño == 2) {
                                        System.out.println("El total de su envío es: " + (total+tmi+((int)peso*2)) + " EUR");
                                    }
                                    if (tamaño == 3) {
                                        System.out.println("El total de su envío es: " + (total+tgi+((int)peso*2)) + " EUR");
                                    }
                                }
                                System.out.printf("El código de su envío es " + "ENV" + "%03d",env);
                                System.out.println();
                                System.out.println("------------------------------------");
                                break;
                            case 'B':
                                System.out.println("¿Cuántos días han pasado desde que recibió la notificación de su paquete?");
                                int noti = teclado.nextInt();
                                rec++;
                                if (noti > 4) {
                                    System.out.println("Tiene que abonar 5 EUR para retirar su paquete");
                                    System.out.printf("El código de su recogida es " + "REC" + "%03d",rec);
                                    System.out.println();
                                    System.out.println("------------------------------------");
                                } else {
                                    System.out.printf("El código de su recogida es " + "REC" + "%03d",rec);
                                    System.out.println();
                                    System.out.println("------------------------------------");
                                }
                                break;
                            case 'C':
                                System.out.println("Saliendo...");
                                System.out.println();
                                System.out.println("------------------------------------");
                                break;
                            default:
                                System.out.println("No ha introducido una opciión válida");
                                break;
                        }
                    }
                    while (letra != 'C');
                    break;
                case 2:
                    int opci = 5;
                    do {
                        System.out.println("Introduzca 1 para Enviados/Recibidos 2 para modificar precios y 3 para salir");
                        opci = teclado.nextInt();
                        switch (opci) {
                            case 1:
                                System.out.println("Número de paquete enviados: " + env);
                                System.out.println("Porcentaje de paquetes enviados: " + ((float)env/((float) env+(float) rec))*100  + "%");
                                System.out.println("Número de paquetes recibidos: " + rec);
                                System.out.println("Porcentaje de paquetes recibidos: " + ((float)rec/((float)env+(float)rec))*100 + "%");
                                System.out.println();
                                System.out.println("------------------------------------");
                                break;
                            case 2:
                                int tipo = 8;
                                int tamaño = 4;
                                while (tipo != 1 && tipo != 2) {
                                    System.out.println("Introduzca el tipo de envío que quiere modificar, 1 para Nacional y 2 para Internacional");
                                    tipo = teclado.nextInt();
                                    if (tipo != 1 && tipo != 2) {
                                        System.out.println("La opción que ha introducido no es válida");
                                    }
                                }
                                while (tamaño != 1 && tamaño != 2 && tamaño != 3) {
                                    System.out.println("Introduzca 1 si quiere modificar los paquetes pequeños 2 si quiere modificar los paquetes medianos y 3 si quiere modificar los paquetes grandes");
                                    tamaño = teclado.nextInt();
                                    if (tamaño != 1 && tamaño != 2 && tamaño != 3) {
                                        System.out.println("La opción que ha introducido no es válida");
                                    }
                                }
                                if (tipo == 1) {
                                    if (tamaño == 1) {
                                        System.out.println("Introduzca el nuevo coste de los envíos Nacionales de tamaño pequeño. Actualmente el coste es " + tpn);
                                        tpn = teclado.nextFloat();
                                    }
                                    if (tamaño == 2) {
                                        System.out.println("Introduzca el nuevo coste de los envíos Nacionales de tamaño mediano. Actualmente el coste es " + tmn);
                                        tmn = teclado.nextFloat();
                                    }
                                    if (tamaño == 3) {
                                        System.out.println("Introduzca el nuevo coste de los envíos Nacionales de tamaño grande. Actualmente el coste es " + tgn);
                                        tgn = teclado.nextFloat();
                                    }
                                } else {
                                    if (tamaño == 1) {
                                        System.out.println("Introduzca el nuevo coste de los envíos Internacionales de tamaño pequeño. Actualmente el coste es " + tpi);
                                        tpi = teclado.nextFloat();
                                    }
                                    if (tamaño == 2) {
                                        System.out.println("Introduzca el nuevo coste de los envíos Internacionales de tamaño mediano. Actualmente el coste es " + tmi);
                                        tmi = teclado.nextFloat();
                                    }
                                    if (tamaño == 3) {
                                        System.out.println("Introduzca el nuevo coste de los envíos Internacionales de tamaño grande. Actualmente el coste es " + tgi);
                                        tgi = teclado.nextFloat();
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Saliendo...");
                                System.out.println();
                                System.out.println("------------------------------------");
                                break;
                            default:
                                System.out.println("No ha introducido una opción válida");
                                System.out.println();
                                break;
                        }
                    } while (opci != 3);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No ha introducido una opción válida");
                    break;
            }
        }
        while (opcion != 3);
    }
}
