import java.util.Scanner;

class Cond26{
    public static void main(String[] args) {
        String day, card;
        int indv = 0, pair = 0, qtyPeople;
        double costIndv = 8, percent = 0, costPair = 11, discount, total, subtotal;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Tickets to buy?: ");
        qtyPeople = sc.nextInt();
        System.out.println("Day?: ");
        day = sc1.nextLine().toLowerCase();
        System.out.println("Do you have card? (s/n): ");
        card = sc1.nextLine().toLowerCase();
        switch (card) {
            case "s":
                percent = 0.1;
                break;
            case "n":
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        System.out.println("Detail");
        switch (day) {
            case "lunes":
            case "martes":
            case "viernes":
            case "sabado":
            case "domingo":
                indv = qtyPeople;
                break;
            case "miercoles":
                costIndv = 5;
                indv = qtyPeople;
                break;
            case "jueves":
                indv = (qtyPeople % 2);
                pair = (int)(Math.floor((qtyPeople / 2)));
                break;
            default:
                break;
        }
        subtotal = (costIndv * indv) + (costPair * pair);
        discount = subtotal * percent;
        total = subtotal - discount;
        if(pair > 0){
            System.out.println("Tickets for couples: " + pair);
            System.out.println("Tickets for couples price: " + costPair);
        }
        if (indv > 0) {
            System.out.println("Tickets for single: " + indv);
            System.out.println("Tickets for single price: " + costIndv);    
        }
        System.out.println("Total: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("To pay: " + total);
    }
}