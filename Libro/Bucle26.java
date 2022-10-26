import java.util.Scanner;

public class Bucle26 {
    public static void main(String[] args) {
        int num, digit,lenght = 0, ld,reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        System.out.println("Ingrese el digito a buscar: ");
        digit = sc.nextInt();
        System.out.print("El digito esta en las posicion(es): ");
        while (num != 0) {
            reverse = (reverse * 10) + (num % 10);
            num = Math.round(num / 10);
            lenght++;
        }
        for (int i = 1; i <= lenght; i++) {
            ld = reverse % 10;
            if (ld == digit) {
                System.out.print(i + " ");
            }
            reverse = Math.round(reverse / 10);
        }
    }
}
