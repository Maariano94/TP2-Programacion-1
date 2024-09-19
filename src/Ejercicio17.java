import java.time.LocalDateTime;
import java.util.Date;

public class Ejercicio17 {

    public static void main(String[] args) {

        Date fechaActual = new Date();
        String fechaString = FuncionesPrograma.getFechaString(fechaActual);
        System.out.println("La fecha actual es: " + fechaString);

        //Ejercicio18

        int dia = 26;
        int mes = 12;
        int anio = 2029;

        Date fecha = FuncionesPrograma.getFechaDate(dia, mes, anio);
        System.out.println("La fecha es: " + fecha);

    }

}
