import java.util.Scanner;

public class Bucle39 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int fact = 1;
            System.out.print(i + "! = ");
            for (int j = 1; j <= i; j++) {
                fact = fact * j;
            }
            System.out.println(fact);
        }
    }
}
