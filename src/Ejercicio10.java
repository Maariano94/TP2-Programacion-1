import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Convertidor de MAYÚCULAS-minúsculas");
        System.out.println("Ingrese la cadena de texto a convertir: ");
        String cadena = sc.nextLine();
        System.out.println("Elija la opción que desea:");
        System.out.println("Opción 1: MAYÚSCULAS \nOpción 2: minúsculas");
        String opcion = sc.nextLine();


        if (opcion.equals("1")) {
            String mayusculas = cadena.toUpperCase();
            System.out.println("Cadena en MAYÚSCULAS: " + mayusculas);

        }else {

            String minusculas = cadena.toLowerCase();
            System.out.println("Cadena en minusculas: " + minusculas);

        }


    }
}
