package Poo.PruebasPOO;

public class Main {
    public static void main(String[] args) {
        Persona pedro = new Persona("Hombre");
        Persona maria = new Persona("Mujer");
        pedro.setName("Pedro");
        pedro.sellTicket(2);
        maria.sellTicket(4);
        System.out.println(Persona.getTickets());
        maria.setName("Pepa");
        System.out.println("Primero");
        System.out.println(pedro.getSexo());
        System.out.println(pedro.getName());
        System.out.println("Segunda");
        System.out.println(maria.getName());
        System.out.println(maria.getSexo());
    }
}
