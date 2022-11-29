package Terminals;

public class Terminal {
    private String numero;
    private int tiempo;

    public Terminal(String numero) {
        this.numero = numero;
        this.tiempo = 0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void llama(Terminal receptor, int tiempo) {
        this.tiempo += tiempo;
        receptor.setTiempo(receptor.getTiempo() + tiempo);
    }

    public String toString() {
        return "N° " + numero + " - " + tiempo + "s de conversacion";
    }
    
    
}
