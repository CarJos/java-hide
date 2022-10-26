import java.util.Scanner;

public class Bucle25 {
    public static void main(String[] args) {
        int num, reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        while (num != 0) {
            reverse = (reverse * 10) + (num % 10);
            num = Math.round(num / 10);
        }
        System.out.println("Numero al reves: " + reverse);
    }
}
