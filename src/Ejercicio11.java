import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra 1 para ser comparada con la palabra 2: ");
        String palabra1 = sc.nextLine();
        System.out.println("Ingrese la palabra 2");
        String palabra2 = sc.nextLine();

        if(palabra1.equals(palabra2)){

            System.out.println("Las palabras son iguales");
        }else {
            System.out.println("Las palabras no son iguales");
        }

        int resultadoComparacion = palabra1.compareTo(palabra2);
        if (resultadoComparacion < 0){

            System.out.println("La comparación de la palabra 1 a la palabra 2 es menor que 0");


        }else if (resultadoComparacion > 0){

            System.out.println("La comparación de la palabra 1 a la palabra 2 es mayor a 0");


        } else {

            System.out.println("La comparación de las palabras da igual a 0");
        }

        int resultadoComparacion2 = palabra1.compareToIgnoreCase(palabra2);

            if (resultadoComparacion2 < 0){

                System.out.println("La comparación de la palabra 1 a la palabra 2 es menor que 0");


            }else if (resultadoComparacion2 > 0){

                System.out.println("La comparación de la palabra 1 a la palabra 2 es mayor a 0");


            } else {

                System.out.println("La comparación de las palabras da igual a 0");
            }
        }

    }
