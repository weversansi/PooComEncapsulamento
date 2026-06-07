package br.com.alura.horadapratica.herenca.bancodigital;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal;

    public void cobrarTarifaMensal( double tarifaMensal){
        this.tarifaMensal = tarifaMensal;
        saldo -= this.tarifaMensal;

        System.out.println("Tarifa cobrada com sucesso");

    }
}
