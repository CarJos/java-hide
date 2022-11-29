package Poo.PruebasPOO;

public class Persona {
    String name,sexo;
    static int tickets = 10;

    Persona (String s){
        this.sexo = s;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return this.sexo;
    }

    public static int getTickets() {
        return tickets;
    }

    public void sellTicket(int ticket) {
        tickets = tickets - ticket;
    }
    
    
}
