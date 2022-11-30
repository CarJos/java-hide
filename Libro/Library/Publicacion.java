package Library;

public class Publicacion {
    private String ISBN;
    private int anio;
    private String titulo;
    
    public Publicacion(String ISBN, String titulo, int anio) {
        this.ISBN = ISBN;
        this.anio = anio;
        this.titulo = titulo;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String toString() {
        return "ISBN: " + ISBN +  ", titulo: " + titulo + ", fecha de publicacion: " + anio;
    }

    
}
