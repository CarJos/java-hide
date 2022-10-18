import java.util.Scanner;

class SegundoGrado{
	public static void main(String[] args){ 
		double primeraRaiz, segundaRaiz;
		System.out.print("Ingrese el coeficiente de a: ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.print("Ingrese el coeficiente de b: ");
		Scanner scn = new Scanner(System.in);
		double b = scn.nextDouble();
		System.out.print("Ingrese el coeficiente de c: ");
		Scanner scnr = new Scanner(System.in);
		double c = scnr.nextDouble();
		primeraRaiz = ((-1 * b) + (Math.sqrt(Math.pow(b,2)-(4 * a * c))))/(2 * a);
		segundaRaiz = ((-1 * b) - (Math.sqrt(Math.pow(b,2)-(4 * a * c))))/(2 * a);
		System.out.println(primeraRaiz);
		System.out.println(segundaRaiz);
	}
}