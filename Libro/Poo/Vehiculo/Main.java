import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coche chevy = new Coche(1900);
        Bicicleta bici = new Bicicleta(9);
        int opc = 0;
        int distancia;
        while (opc != 8) {
            System.out.println("\n1. Anda con la bicicleta\n2. Haz el caballito con la bicicleta\n3. Anda con el coche\n4. Quema rueda con el coche\n5. Ver kilometraje de la bicicleta\n6. Ver kilometraje del coche\n7. Ver kilometraje total\n8. Salir");
            System.out.print("Elige una opcion (1-8): ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Distancia a recorrer?: ");
                    distancia = sc.nextInt();
                    bici.recorre(distancia);
                    break;
                case 2:
                    bici.hazCaballito();
                    break;
                case 3:
                    System.out.print("Distancia a recorrer?: ");
                    distancia = sc.nextInt();
                    chevy.recorre(distancia);
                    break;
                case 4:
                    chevy.quemarRueda();
                    break;
                case 5:
                    System.out.println(bici.getKilometrosRecorridos());
                    break;
                case 6:
                    System.out.println(chevy.getKilometrosRecorridos());
                    break;
                case 7:
                    System.out.println(Vehiculo.getKilometrosTotales());
                    break;
                default:
                    break;
            }
        }
        
    }
}