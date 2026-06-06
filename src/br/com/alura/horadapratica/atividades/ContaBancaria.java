package br.com.alura.horadapratica.atividades;

public class ContaBancaria {
    private int numeroDaconta;
    private  double saldo;
    public String titular;


    public int getNumeroDaconta() {
        return numeroDaconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroDaconta(int numeroDaconta) {
        this.numeroDaconta = numeroDaconta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
