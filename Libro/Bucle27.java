import java.util.Scanner;

public class Bucle27 {
    public static void main(String[] args) {
        int num, digit,lenght = 0, ld,reverse = 0, contPar = 0,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        while (num != 0) {
            reverse = (reverse * 10) + (num % 10);
            num = Math.round(num / 10);
            lenght++;
        }
        for (int i = 1; i <= lenght; i++) {
            ld = reverse % 10;
            if (ld % 2 == 0 && ld != 0) {
                System.out.print(i + " ");
                contPar++;
                sum += ld;
            }
            reverse = Math.round(reverse / 10);
        }
        System.out.println("\nLa suma de los digitos pares es: " + sum);
    }
}
