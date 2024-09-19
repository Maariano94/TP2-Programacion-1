import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena: ");
        String cadena = sc.nextLine();
        String todoMinusculas = cadena.toLowerCase();
        String reemplazo = cadena.replaceAll("a", "e");

        System.out.println("La cadena ingresada sufrió modificaciones y quedó así: " + reemplazo);

    }
}
