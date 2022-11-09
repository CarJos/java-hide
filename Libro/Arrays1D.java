import java.util.Scanner;

public class Arrays1D {
    public static void main(String[] args) {
        // int num;
        // int[] numero = new int[20];
        // int[] cuadrado = new int[20];
        // int[] cubo = new int[20];
        // for (int i = 0; i < 20; i++) {
        //     num = (int)Math.round(Math.random() * 100);
        //     numero[i] = num;
        //     cuadrado[i] = (int)Math.pow(num, 2);
        //     cubo[i] = (int)Math.pow(num, 3);
        // }
        // System.out.println("Numero  Cuadrado    Cubo");
        // for (int i = 0; i < 20; i++) {
        //     System.out.println(numero[i] + "\t" + cuadrado[i] + "\t" + cubo[i]);
        // }
        // ----------------------------------------------------
        // ----------------------------------------------------
        // int[] numero = new int[10];
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 10; i++) {
        //     System.out.print("Ingrese un numero: ");
        //     numero[i] = sc.nextInt();
        // }
        // for (int j = 9; j >= 0; j--) {
        //     System.out.println(numero[j] + " ");
        // }
        // ----------------------------------------------------
        // ----------------------------------------------------
        // int mayor = 0;
        // int[] numero = new int[10];
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 10; i++) {
        //     System.out.print("Ingrese un numero: ");
        //     numero[i] = sc.nextInt();
        // }
        // int menor = numero[9];
        // for (int n : numero) {
        //     System.out.print(n + " ");
        //     if (n > mayor) {
        //         mayor = n;
        //     }
        //     if (n < menor) {
        //         menor = n;
        //     }
        // }
        // System.out.println("Mayor: " + mayor);
        // System.out.println("Menor: " + menor);
        // ----------------------------------------------------
        // ----------------------------------------------------
        // int maximo = 0, minimo;
        // int[] numeros = new int[10];
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Ingrese un numero: ");
        //     numeros[i] = sc.nextInt();
        // }
        // minimo = numeros[0];
        // for (int n : numeros) {
        //     if (n > maximo) {
        //         maximo = n;
        //     }
        //     if (n < minimo) {
        //         minimo = n;
        //     }
        // }
        // System.out.println("Lista de numeros");
        // for (int n : numeros) {
        //     if (n == maximo) {
        //         System.out.println(n + " maximo");
        //     }
        //     else if (n == minimo) {
        //         System.out.println(n + " minimo");
        //     }
        //     else{
        //         System.out.println(n);
        //     }
        // }
        // ----------------------------------------------------
        // ----------------------------------------------------
        int contPar = 0, contImpar = 0;
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] == 0) {
                continue;
            } else if (numeros[i] % 2 == 0){
                contPar++;
            } else{
                contImpar++;
            }
        }
        System.out.println("\n");
        int[] par = new int[contPar], impar = new int[contImpar];
        for (int i : numeros) {
            System.out.print(i + " ");
            if (numeros[i] % 2 == 0){
                
            }
        }
        for (int i : par) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for (int i : impar) {
            System.out.print(i);
        }
        // for (int i = 0; i < contPar; i++) {
        //     numeros[i] = par[i];
        // }
        // for (int i = 0; i < contImpar; i++) {
        //     numeros[i + contPar] = impar[i];
        // }
        // for (int i : numeros) {
        //     System.out.println(i + " ");
        // }

    }
}