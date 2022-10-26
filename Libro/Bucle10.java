import java.util.Scanner;

public class Bucle10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0, num = 0, sum = 0;
        double media;
        while (num >= 0){
            System.out.println("Ingrese un numero");
            num = sc.nextInt();
            cont++;
            sum += num;
            if (num < 0) {
                cont--;
                sum -= num;
            }
        }
        media = (double)sum / cont;
        System.out.println("La media es de: " + media);
    }
}
