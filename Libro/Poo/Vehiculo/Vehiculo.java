public class Vehiculo {
    private static int vehiculosCreados;
    private static int kilometrosTotales;
    private int kilometrosRecorridos;

    public Vehiculo(){
        this.kilometrosRecorridos = 0;
    }

    public static int getKilometrosTotales() {
        return Vehiculo.kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }

    public void recorre(int k){
        this.kilometrosRecorridos += k;
        Vehiculo.kilometrosTotales += k;
    }
}
