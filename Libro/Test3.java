import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int i = 4, cmb = 1234;
        Scanner sc = new Scanner(System.in);
        while(i > 0){
            System.out.println("Ingrese combinacion de 4 digitos: ");
            int comb = sc.nextInt();
            if(comb == cmb){
                System.out.println("Nice");
                break;
            } else {
                i--;
                System.out.println("Try again");
            }
        }
        if (i == 0) {
            System.out.println("\bBlock");
        }
    }
}
