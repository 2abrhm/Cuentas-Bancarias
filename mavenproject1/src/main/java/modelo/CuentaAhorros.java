package modelo;

public class CuentaAhorros extends Cuenta {
    private double tasaInteres;

    public CuentaAhorros(String titular, double saldo, double tasaInteres) {
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public double calcularInteres() {
        return saldo * tasaInteres;
    }
}