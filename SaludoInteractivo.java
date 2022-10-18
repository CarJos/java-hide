import java.util.Scanner;

class SaludoInteractivo {
    public static void main(String[] args) {
        System.out.print("Ingresa tu nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        System.out.println("Bienvenido " + nombre);
    }    
}