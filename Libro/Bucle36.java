import java.util.Scanner;

public class Bucle36 {
    public static void main(String[] args) {
        int num, reverse = 0, aux;
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero: ");
        num = sc.nextInt();
        aux = num;
        while (aux != 0) {
            reverse = (reverse * 10) + (aux % 10);
            aux = Math.round(aux / 10);
        }
        if (num == reverse) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
}
