import java.util.Scanner;

public class TestBucle {
    public static void main(String[] args) {
        // for (int i = 0; i < 101; i++) {
        //     if (i % 5 == 0) {
        //         System.out.print(i + " ");
        //     }
        // }
        int num, bin = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        num = sc.nextInt();
        while (num != 0) {
            System.out.println(num);
            System.out.println(num % 2 + " Binario");
            bin = (bin * 10) + (num % 2);
            num = num / 2;
        }
        System.out.println(bin);
    }
}
