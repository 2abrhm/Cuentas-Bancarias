package modelo;

public abstract class Cuenta {
    protected String titular;
    protected double saldo;

    // Constructor con parámetros
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Ligadura estática
    public static String nombreBanco() {
        return "Banco Abraham";
    }

    // Sobrecarga
    public void depositar(double monto) {
        saldo += monto;
    }

    public void depositar(double monto, String nota) {
        saldo += monto;
        System.out.println("Deposito de " + monto + " | Nota: " + nota);
    }

    // Método abstracto
    public abstract double calcularInteres();
}