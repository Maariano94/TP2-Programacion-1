import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero decimal: ");
        double valorDecimal = sc.nextDouble();

        sc.close();

        short valorShort = (short) valorDecimal;
        System.out.println("Valor convertido a short: " + valorShort);

        int valorInt = (int) valorDecimal;
        System.out.println("Valor convertido a int: " + valorInt);

        long valorLong = (long) valorDecimal;
        System.out.println("Valor convertido a long: " + valorLong);

        String valorString = String.valueOf(valorDecimal);
        System.out.println("Valor convertido a string: " + valorString);

        float valorFloat = (float) valorDecimal;
        System.out.println("Valor convertido a float: " + valorFloat);


    }

}
