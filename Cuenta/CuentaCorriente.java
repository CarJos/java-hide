package Cuenta;

public class CuentaCorriente {
    private long numero;
    private double saldo;
    
    public CuentaCorriente(double saldo) {
        this.numero = Math.round(((Math.random() * 899999999) + 100000000));
        this.saldo = saldo;
    }

    public CuentaCorriente() {
        this.numero = Math.round(((Math.random() * 899999999) + 100000000));
        this.saldo = 0;
    }

    public long getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "Numero de cta: " + numero + "Saldo: " + saldo + "$";
    }

    public void ingreso(double ingreso) {
        this.saldo += ingreso;
    }

    public void cargo(double retiro) {
        if (retiro > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= retiro;
        }
    }

    public void transferencia(CuentaCorriente cuenta, double deposito) {
        if (deposito > cuenta.getSaldo()) {
            System.out.println("Saldo insuficente");
        } else {
            cuenta.setSaldo(cuenta.getSaldo() + deposito);
            this.saldo -= deposito;
        }
    }
}
