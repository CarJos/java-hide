package Cards;

public class TarjetaRegalo {
    private double saldo;
    private long id;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.id = Math.round(((Math.random() * 89999) + 10000));
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString() {
        return "Tarjeta n° " + id + " - Saldo " + saldo + "$";
    }
    
    public void gasta(double retiro){
        if (retiro > this.saldo) {
            System.out.println("No tiene suficiente saldo para gastar " + retiro + "$");
        } else {
            this.saldo -= retiro;
        }   
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo tarjeta){
        TarjetaRegalo card = new TarjetaRegalo(this.saldo + tarjeta.getSaldo());
        this.saldo = 0;
        tarjeta.setSaldo(0);
        return card;
    }
}
