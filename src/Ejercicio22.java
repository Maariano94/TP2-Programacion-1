import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int numero = sc.nextInt();

        int suma = sumarDigitos(numero);
        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);

        sc.close();

    }

    public static int sumarDigitos(int num){

        if (num == 0){

            return 0;
        } else {

            return (num % 10) + sumarDigitos((num / 10));
        }

    }
}
