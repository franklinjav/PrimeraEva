package StringsPrimeraEva;

import java.io.IOException;
import java.util.Scanner;

public class Eje1Strings {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String opcion = "50";
        do {
            System.out.println("Introduzca un número del 1 al 10 para conocer diferentes métodos de la clase string, para salir debe introducir el número 11");
            opcion = teclado.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("En esta opción conoceremos el método ToUppercase, para ello introduzca una frase");
                    String frase = teclado.nextLine();
                    System.out.println("Su frase pasada entera a mayúsculas es: " + frase.toUpperCase());
                    break;
                case "2":
                    System.out.println("En esta opción conoceremos el método equals para comparar dos strings (si no queremos tomar en cuenta las mayúsculas podemos usar el método equalsIgnoreCase)");
                    String palabra1 = "rojo";
                    boolean respuesta = false;
                    System.out.println("Intente adivinar el color");
                    while (respuesta==false) {
                        String palabra2 = teclado.nextLine();
                        if (palabra2.equals(palabra1)== false) {
                            System.out.println("Incorrecto, inténtalo nuevamente");
                        } else {
                            System.out.println("¡Correcto!");
                            respuesta = true;
                        }
                    }
                    break;
                case "3":
                    System.out.println("En esta opción conoceremos el método charAt que nos devuelve la posición de la primera aparición del carácter");
                    System.out.println("Introduzca una palabra o texto");
                    String texto = teclado.nextLine();
                    System.out.println("Introduzca la posición que quiere buscar");
                    String posi = teclado.nextLine();
                    System.out.println("El carácter que está es esa posición es: " + texto.charAt(Integer.parseInt(posi)-1));
                    break;
                case "4":
                    System.out.println("En esta opción conoceremos el método substring que nos devuelve la subcadena comprendida entre las posiciones n1 y n2-1");
                    System.out.println("Introduzca una palabra o texto");
                    String texto2 = teclado.nextLine();
                    System.out.println("Introduzca la primera posición");
                    String posi1 = teclado.nextLine();
                    System.out.println("Introduzca la segunda posición");
                    String posi2 = teclado.nextLine();
                    System.out.println("La cadena es la siguiente: " + texto2.substring(Integer.parseInt(posi1)-1,Integer.parseInt(posi2)-1));
                    break;
                case "5":
                    System.out.println("En esta opción conoceremos el método compareTo que nos devuelve 0 si las dos cadenas son iguales. <0 si la primera es alfabéticamente menor que la segunda ó >0 si la primera es alfabéticamente mayor que la segunda.");
                    System.out.println("Introduzca una palabra");
                    String palabra3 = teclado.nextLine();
                    System.out.println("Introduzca otra palabra");
                    String palabra4 = teclado.nextLine();
                    if (palabra3.compareTo(palabra4) == 0) {
                        System.out.println("Son la misma palabra");
                    } else if (palabra3.compareTo(palabra4) < 0) {
                        System.out.println(palabra3 + " es alfabéticamente menor que " + palabra4);
                    } else {
                        System.out.println(palabra3 + " es alfabéticamente mayor que " + palabra4);
                    }
                    break;
                case "6":
                    System.out.println("En esta opción conoceremos el método indexOf que nos devuelve la posición de la primera aparición del carácter");
                    System.out.println("Introduzca una palabra o texto");
                    String texto3 = teclado.nextLine();
                    System.out.println("Introduzca el carácter del que desea saber la posición");
                    String carac = teclado.nextLine();
                    System.out.println("La posición de su carácter es " + texto3.indexOf(carac));
                    break;
                case "7":
                    System.out.println("En esta opción conoceremos el método lengh que nos devuelve la longitud de la cadena");
                    System.out.println("Introduzca una palabra o texto");
                    String texto4 = teclado.nextLine();
                    System.out.println("La longitud es de: " + texto4.length());
                    break;
                case "8":
                    System.out.println("En esta opción conoceremos el método lastIndexOf que nos devuelve la posición de la última aparición del carácter");
                    System.out.println("Introduzca una palabra o texto");
                    String texto5 = teclado.nextLine();
                    System.out.println("Introduzca el carácter que desea buscar");
                    String carac2 = teclado.nextLine();
                    System.out.println("La última aparición del carácter es: " + texto5.lastIndexOf(carac2));
                    break;
                case "9":
                    System.out.println("En esta opción conoceremos el método valueOf que nos convierte el valor N a String. N puede ser de cualquier tipo.");
                    System.out.println("Introduzca un número");
                    int numero = teclado.nextInt();
                    String caracnum = String.valueOf(numero);
                    System.out.println("Su número pasa a ser la siguiente cadena de carácteres: " + caracnum);
                    break;
                case "10":
                    System.out.println("En esta opción conoceremos el método concat que nos permite enlazar cadenas de texto ya definidas o también literales");
                    System.out.println("Para ver un ejemplo debe continuar la siguiente frase: Érase una vez");
                    String texto6 = teclado.nextLine();
                    String frase2 = "Érase una vez ";
                    System.out.println("La frase queda de la siguiente manera: " + frase2.concat(texto6));
                    break;
                case "11":
                    System.out.println("Saliendo...");
                    System.out.println("-----------------------------------");
                    break;
                default:
                    System.out.println("No es una opción válida");
                    break;
            }
        } while (!opcion.equals("11"));
    }
}
