import java.util.Scanner;

public class Bucle42 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        num = sc.nextInt();
        for (int i = num; i < (num + 5); i++) {
            int cont = 0;
            System.out.print(i + " ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont < 1) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
        }
    }
}
