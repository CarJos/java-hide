public class Coche extends Vehiculo{
    private int cilindros;

    public Coche(int c){
        super();
        this.cilindros = c;
    }

    public void quemarRueda() {
        System.out.println("Quemando rueda");
    }
}
