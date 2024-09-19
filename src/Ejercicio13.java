import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primer cadena: ");
        String texto1 = sc.nextLine();
        System.out.println("Ingrese la segunda cadena: ");
        String texto2 = sc.nextLine();

        int posicion = texto1.indexOf(texto2);

        if(posicion != -1){
            System.out.println("La primer cadena SI encuentra dentro de la segunda");

        } else {
            System.out.println("La primer cadena NO se encuentra dentro de la segunda");
        }
        sc.close();
    }
}
