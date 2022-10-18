import java.util.Scanner;

class Caracter{
	public static void main(String[] args){
		System.out.print("Ingrese un valor ASCII: ");
		Scanner sc = new Scanner(System.in);
		byte ch = sc.nextByte();
		char c = (char)ch;
		System.out.println(c);
	}
}