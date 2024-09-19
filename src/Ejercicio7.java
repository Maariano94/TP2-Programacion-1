import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena para determinar su tamaño: ");
        String cadena = sc.nextLine();

        int tamaño = cadena.length();
        int contadorVocales = 0;

        for (int i=0; i < tamaño; i++) {

            char caracter = cadena.charAt(i);

            caracter = Character.toLowerCase(caracter);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){

                contadorVocales++;

            }

        }
        System.out.println("El tamaño de la cadena es: " + tamaño);
        System.out.println("La cantida de vocales que contiene es: " + contadorVocales);
    }

}
