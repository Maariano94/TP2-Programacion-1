import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero mayor a cero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            int suma = sumarNumeros(numero);
            System.out.println("La suma de los números naturales desde " + numero + " hasta 1 es: " + suma);
        } else {
            System.out.println("El número ingresado no es mayor a cero.");
        }

        scanner.close();
    }

    public static int sumarNumeros(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sumarNumeros(num - 1);
        }
    }
}