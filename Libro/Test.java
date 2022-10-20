import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double fd = 0, ld = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero");
        double a = sc.nextDouble();
        ld = a % 10;
        if (a > 0 && a < 10){
            fd = a;
        } else {
            while (a != 0){
                a = Math.floor(a / 10);
                if (a > 0) {
                    fd = a;
                }
            }
        }
        System.out.println("First" + Math.round(fd));
        System.out.println("Last" + Math.round(ld));
    }
}
