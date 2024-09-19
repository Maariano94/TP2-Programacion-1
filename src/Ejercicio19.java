public class Ejercicio19 {

    public static void main(String[] args) {

        OperacionMatematica operacion1 = new OperacionMatematica("+", 5.6, 6.9 );
        System.out.println(operacion1.getOperacion());

        operacion1.setOperacion("+");
        System.out.println(operacion1.operacionMatematica());
        operacion1.setOperacion("-");
        System.out.println(operacion1.operacionMatematica());
        operacion1.setOperacion("*");
        System.out.println(operacion1.operacionMatematica());
        operacion1.setOperacion("/");
        System.out.println(operacion1.operacionMatematica());



    }
}
