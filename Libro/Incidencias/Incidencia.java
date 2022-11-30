package Incidencias;

public class Incidencia {
    private int codigo;
    private int puesto;
    private String problema;
    private String estado;
    private String resolucion;

    private static int contadorCodigo = 0;
    private static int contadorPendientes;
    
    public Incidencia(int puesto, String problema) {
        this.codigo = contadorCodigo++;
        this.puesto = puesto;
        this.problema = problema;
        this.estado = "pendiente";
        this.resolucion = resolucion;
    }
    
    
}
