public class Ejercicio6 {

    public static void main(String[] args) {

        String cadena = "La lluvia en Mendoza es escasa";
        String cadenaSinEspacios = cadena.replaceAll(" ", "");

        int cantidadCaracteres = cadenaSinEspacios.length();

        System.out.println("La cadena \"La lluvia en Mendoza es escasa\" tiene " + cantidadCaracteres + " caracteres.");

    }
}
