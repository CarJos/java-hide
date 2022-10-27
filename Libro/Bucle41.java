import java.util.Scanner;

public class Bucle41 {
    public static void main(String[] args) {
        int num, aux, ld, odd = 0, even = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        num = sc.nextInt();
        aux = num;
        while (aux != 0) {
            ld = aux % 10;
            if (ld % 2 == 0) {
                odd++;
            } else {
                even++;
            }
            aux = Math.round(aux / 10);
        }
        System.out.println("El " + num + " contiene " + odd + " digitos pares y " + even + " digitos impares");
    }
}
