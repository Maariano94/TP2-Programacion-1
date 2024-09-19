import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cantidad de dinero (por ejemplo, 1390.55): ");
        double cantidad = scanner.nextDouble();

        int[] billetes = {200, 100, 50, 20, 10, 5, 2, 1};
        double[] monedas = {0.50, 0.25, 0.10, 0.05};

        System.out.println("Para la cantidad de " + cantidad + " se necesitan:");

        for (int billete : billetes) {
            int numBilletes = (int) (cantidad / billete);
            if (numBilletes > 0) {
                System.out.println(numBilletes + " billete(s) de " + billete);
                cantidad -= numBilletes * billete;
            }
        }

        for (double moneda : monedas) {
            int numMonedas = (int) (cantidad / moneda);
            if (numMonedas > 0) {
                System.out.println(numMonedas + " moneda(s) de " + moneda);
                cantidad -= numMonedas * moneda;
            }
        }

        scanner.close();
    }
}