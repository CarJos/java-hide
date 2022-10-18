import java.util.Scanner;

class Precio{
	public static void main(String[] args){
		final float iva = 0.21;
		System.out.print("Ingrese el precio: ");
		Scanner sc = new Scanner(System.in);
		float precio = sc.nextFloat();
		precioFinal = precio + (iva * precio);
		System.out.println(precioFinal);
	}
}