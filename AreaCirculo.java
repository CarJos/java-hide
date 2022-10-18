import java.util.Locale;
import java.util.Scanner;

class AreaCirculo {
    public static void main(String[] args) {
        System.out.print("Ingresa el radio del circulo: ");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Double radio = sc.nextDouble();

        System.out.println("El area del circulo es: " + (Math.PI*Math.pow(radio, 2)));
    }    
}
