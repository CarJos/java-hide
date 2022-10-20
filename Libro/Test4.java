import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int qty = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        double a = sc.nextDouble();
            while (a != 0){
                a = Math.floor(a / 10);
                if (a > 0) {
                    qty++;
                }
            }
        System.out.println("Quantity: " + (qty+1));
    }
}
