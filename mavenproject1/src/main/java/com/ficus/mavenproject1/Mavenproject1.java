package com.ficus.mavenproject1;

import modelo.Cuenta;
import modelo.CuentaAhorros;
import modelo.CuentaCorriente;

public class Mavenproject1 {
    public static void main(String[] args) {
        // Ligadura estática
        System.out.println("Banco: " + Cuenta.nombreBanco());

        // Ligadura dinámica (polimorfismo)
        Cuenta c1 = new CuentaAhorros("Abraham", 1000, 0.03);
        Cuenta c2 = new CuentaCorriente("David", 2000, 500);

        // Sobrecarga
        c1.depositar(500);
        c2.depositar(1000, "Pago de nomina");

        // Sobreescritura + polimorfismo
        System.out.println("Interes ahorros: " + c1.calcularInteres());
        System.out.println("Interes corriente: " + c2.calcularInteres());
    }
}