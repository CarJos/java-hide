import java.util.Scanner;

class Bucle7{
    public static void main(String[] args) {
        final int secret = 9876;
        int tries = 3, pass;
        Scanner sc = new Scanner(System.in);
        while (tries != 0){
            System.out.println("Ingrese contraseña de 4 digitos");
            pass = sc.nextInt();
            if (pass == secret){
                System.out.println("\nAbierta satisfactoriamente");
                break;
            } else {
                System.out.println("Combinacion incorrecta");
                tries--;
            }
        }
        if (tries == 0) {
            System.out.println("\nTe quedaste sin intentos");
        }
    }
}