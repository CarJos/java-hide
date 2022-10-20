import java.util.Scanner;

public class BuscaTesoro {
    public static void main(String[] args) {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num <= 1){
            c++;
        }
        for (int i = 2; i < num; i++) {
            if((num % i) == 0){
                c++;
            }
        }
        if(c > 0) {
            System.out.println("No es primo");
        } else {
            System.out.println("Es primo");
        }    
    }
}