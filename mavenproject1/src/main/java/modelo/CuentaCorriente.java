package modelo;

public class CuentaCorriente extends Cuenta {
    private double sobregiro;

    public CuentaCorriente(String titular, double saldo, double sobregiro) {
        super(titular, saldo);
        this.sobregiro = sobregiro;
    }

    @Override
    public double calcularInteres() {
        return saldo * 0.01;
    }
}
