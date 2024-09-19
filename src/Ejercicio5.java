import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();

        String Stringconvierte = String.valueOf(numero);

        System.out.println("El numero convertido a String es: " + Stringconvierte);

    }
}
