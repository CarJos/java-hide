package Library;

public class Libro extends Publicacion implements Prestable{
    private boolean prestado;

    public Libro(String ISBN, String titulo, int anio) {
        super(ISBN, titulo, anio);
        this.prestado = false;
    }

    public String toString() {
        return super.toString() + " (" + (this.prestado ? "prestado" : "no prestado") + ")";
    }

    public boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void presta() {
        if (this.estaPrestado()) {
            System.out.println("Lo siento, ese libro está prestado");
        } else {
            this.prestado = true;
        }
    }

    public void devuelve() {
        if (this.estaPrestado()) {
            this.prestado = false;
        } else {
            System.out.println("El libro no ha sido prestado");
        }
    }

    public boolean estaPrestado() {
        return this.prestado;
    }
}
