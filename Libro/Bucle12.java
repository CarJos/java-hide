import java.util.Scanner;

public class Bucle12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fd = 0, ld = 1, serie = 0;
        System.out.println("Ingrese un numero");
        num = sc.nextInt() - 2;
        System.out.print("0 1");
        for (int i = 0; i < num; i++) {
            serie = fd + ld;
            fd = ld;
            ld = serie;
            System.out.print(" " + serie);
        }
    }
}
