import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        float total = 0, cost = 0;
        boolean cr = false, nm = false;
        String msg = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose (apple, strawberry or chocolate): ");
        String taste = sc.nextLine().toLowerCase();
        switch (taste) {
            case "apple":
                total = cost = 18;
                msg = "Apple cake: ";
                break;
            case "strawberry":
                total = cost = 16;
                msg = "Strawberry cake: ";
                break;
            case "chocolate":
                System.out.print("Choose chocolate (dark or white): ");
                String choco = sc.nextLine().toLowerCase();
                switch (choco) {
                    case "dark":
                        total = cost = 14;
                        msg = "Dark chocolate cake: ";
                        break;
                    case "white":
                        total = cost = 15;
                        msg = "White chocolate cake: ";
                        break;
                    default:
                        System.out.println("Opcion Invalida");
                        break;
                }
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        System.out.print("Cream?: ");
        String cream = sc.nextLine().toLowerCase();
        if (cream.equals("yes")){
            total += 2.5;
            cr = true;
        }
        System.out.print("Name?: ");
        String name = sc.nextLine().toLowerCase();
        if (name.equals("yes")){
            total += 2.75;
            nm = true;
        }
        System.out.println(msg + cost);
        if(cr == true){
            System.out.println("With cream: 2.5");
        }
        if (nm == true) {
            System.out.println("With name: 2.75");
        }
        System.out.println("Total: " + total);
    }
}