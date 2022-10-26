import java.util.Scanner;

public class Bucle21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0, num = 0, sum = 0, contImp = 0, mayor = 0;
        double media;
        while (num >= 0){
            System.out.println("Ingrese un numero");
            num = sc.nextInt();
            cont++;
            if (num < 0) {
                cont--;
            } 
            if (num % 2 != 0) {
                sum += num;
                contImp++;
            } else {
                if (num > mayor) {
                    mayor = num;
                }
            }
        }
        media = (double)(sum / contImp);
        System.out.println("Cantidad de numeros: " + cont);
        System.out.println("Media de impares: " + media);
        System.out.println("Mayor par: " + mayor);
    }
}