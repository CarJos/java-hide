import java.util.Locale;
import java.util.Scanner;

public class S03Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Ingrese la nota del primer examen: ");
        double nota1 = sc.nextDouble();
        System.out.print("¿Que nota quieres sacar en el trimestre?: ");
        double notaFinal = sc.nextDouble();
        double nota2 = (notaFinal - (0.4 * nota1))/ 0.6;
        System.out.println("Para tener un " + notaFinal + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");
    }
}
