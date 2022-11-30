package Library;

public class Revista extends Publicacion{
    private int numero;

    public Revista(String ISBN, String titulo, int anio, int numero) {
        super(ISBN, titulo, anio);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString() {
        return super.toString() + " numero: " + numero;
    }

}
