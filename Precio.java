import java.util.Scanner;

class Precio{
	public static void main(String[] args){
		final double iva = 0.21;
		System.out.print("Ingrese el precio: ");
		Scanner sc = new Scanner(System.in);
		double precio = sc.nextDouble();
		double precioFinal = precio + (iva * precio);
		System.out.println(precioFinal);
	}
}