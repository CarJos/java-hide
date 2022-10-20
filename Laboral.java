import java.util.Scanner;

class Laboral{
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un dia: ");
		String dia = sc.nextLine().toLowerCase();
		switch(dia) {
			case "lunes":
			case "martes":
			case "miercoles":
			case "jueves":
			case "viernes":
				System.out.println("\033[32mEs la laborable");
				break;
			case "sabado":
			case "domingo":
				System.out.println("\033[31mNo es la laborable");
				break;
		}
	}
}