public class Ejercicio2 {

    public static void main(String[] args) {

        //Se produce lo que se llama desbordamiento que es cuando una variable supera el rango permitido para el tipo de dato.
        //Se puede resolver utilizando una variable con un rango mayor del que se necesita abarcar.

        System.out.println("Ejemplo de derbordamiento con tipo de dato int:");

        int valorMaximo = Integer.MAX_VALUE;
        int valorDesbordado = valorMaximo + 1;

        System.out.println("Valor desbordado: " + valorDesbordado);

        System.out.println("Ejemplo de desbordamiento con tipo de dato long:");

        long valorMaximo1 = Long.MAX_VALUE;
        long valorDesbordado1 = valorMaximo1 + 1;

        System.out.println("Valor desbordado: " + valorDesbordado1);

    }
}
