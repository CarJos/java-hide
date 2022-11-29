package Amebas;

public class Ameba {
    private int peso;

    public Ameba() {
        this.peso = 3;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Soy una ameba y peso " + this.peso + " microgramos.";
    }

    public void come(int particula) {
        setPeso(getPeso() + (particula - 1));
    }

    public void come(Ameba comida) {
        setPeso(getPeso() + (comida.getPeso() - 1));
        comida.setPeso(0);
    }
}
