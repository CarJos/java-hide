package Pizzas;

public class Pizza {
    private String size;
    private String type;
    private String state;
    private static int totalPedidas;
    private static int totalServidas;
    
    public Pizza(String type, String size) {
        this.size = size;
        this.type = type;
        this.state = "pedida";
        totalPedidas++;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public static int getTotalPedidas() {
        return totalPedidas;
    }
    public static void setTotalPedidas(int totalPedidas) {
        Pizza.totalPedidas = totalPedidas;
    }
    public static int getTotalServidas() {
        return totalServidas;
    }
    public static void setTotalServidas(int totalServidas) {
        Pizza.totalServidas = totalServidas;
    }
    
    public String toString() {
        return "Pizza " + type + " " + size + " " + state;
    }

    public void sirve(){
        if (this.state.equals("servida")) {
            System.out.println("esa pizza ya se ha servido");
        } else {
            this.state = "servida";
            totalServidas++;
        }
    }

    
}
