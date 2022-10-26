import java.util.Scanner;

public class Bucle9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt(), cont = 0;
        while (num != 0){
            num = Math.round(num/10);
            cont++;
        }
        System.out.println("El numero tiene " + cont + " digitos");
    }
}
