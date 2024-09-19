import static java.lang.Integer.parseInt;

public class Ejercicio9 {

    public static void main(String[] args) {

        String cadena = "La lluvia en Mendoza es escasa";

        System.out.println("La representación en código ASCII de la cadena es:");

        for (int i = 0; i < cadena.length(); i++) {

            char caracter = cadena.charAt(i);
            int codigoASCII = (int) caracter;
            System.out.print(caracter + "=" + codigoASCII + " , ");
        }

    }
}
