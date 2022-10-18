import java.util.Scanner;

class TryPass{
	public static void main(String[] args){ 
		String passw = "hola";
		int tries = 3;
		while(tries != 0){
			Scanner sc = new Scanner(System.in);
			System.out.print("Ingrese la contraseña: ");
			String clave = sc.nextLine();
			if(!(passw.equals(clave))){
				System.out.println("Sigue intentando");
				tries--;
			} else {
				System.out.println("Nice!!");
				break;
			}
		}
		if(tries == 0) {
		System.out.println("Perdiste");
		}
	}
}