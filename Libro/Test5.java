import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int fd = 0, sd = 1, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad: ");
        int qty = sc.nextInt() - 2;
        System.out.print("0 1 ");
        for (int i = 0; i < qty; i++) {
            a = fd + sd;
            fd = sd;
            sd = a;
            System.out.print(a + " ");
        }
    }
}
