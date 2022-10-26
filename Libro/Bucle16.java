import java.util.Scanner;

public class Bucle16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cont = 0;
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (num < 2) {
            System.out.println("No puede evaluarse");
        } else if (cont > 0) {
            System.out.println("No es primo");
        } else { 
            System.out.println("Es primo");
        }
    }
}
