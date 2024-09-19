import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();

        String cadenaInvertida = invertirCadena(cadena);
        System.out.println("La cadena invertida es: " + cadenaInvertida);

        sc.close();

    }

    public static String invertirCadena(String str){

        if(str.isEmpty()){

            return str;

        } else {
            return invertirCadena(str.substring(1)) + str.charAt(0);

        }
    }
}
