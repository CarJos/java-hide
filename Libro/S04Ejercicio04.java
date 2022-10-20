import java.util.Locale;
import java.util.Scanner;

public class S04Ejercicio04 {
    public static void main(String[] args) {
        double sueldo;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Ingrese las horas trabajadas: ");
        double horas = sc.nextDouble();
        if(horas <= 40){
            sueldo = horas * 12;
        } else {
            sueldo = (40 * 12) + ((horas - 40) * 16);
        }
        System.out.println("El sueldo semanal que le corresponde es de " + sueldo);
    }
}
