import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;

        while (true) {

            System.out.println("Ingrese un número entre 100 y 999: ");

            try {

                numero = sc.nextInt();

                if (numero >= 100 && numero <= 999){

                    break;

                } else {

                    System.out.println("ERROR. El número ingresado debe estar entre 100 y 999. Intente de nuevo.");

                }

            } catch (java.util.InputMismatchException e) {


                System.out.println("ERROR: Debe ingresar un número válido. Intente de nuevo.");


            }


        }

        int sumaDigitos = 0;
        int temp = numero;

        while (temp > 0) {

            int digito = temp % 10;

            sumaDigitos += digito;

            temp /= 10;
        }

        System.out.println("La suma de los digitos " + numero + " es: " + sumaDigitos);

        sc.close();
    }
}
