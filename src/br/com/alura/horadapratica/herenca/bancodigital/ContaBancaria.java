package br.com.alura.horadapratica.herenca.bancodigital;

public class ContaBancaria {
    protected double saldo;
    private double saque;
    private  double deposito;

    public void sacaDinheiro(double saque) {
        this.saque = saque;

        if ( this.saque > 0 ) {
            if (saldo >= this.saque) {
                saldo -= this.saque;

            } else {
                System.out.println("Você não contém esse valor na conta!");
            }
        }else {
            System.out.println("Você digitou valores negativos");
        }

    }

    public void depositaValor(double deposito){
        this.deposito = deposito;

        if ( this.deposito > 0 ){
            saldo += this.deposito;

        } else {
            System.out.println("Você digitou valores negativos");
        }
    }

    public double consultaSaldo(){
        return saldo;
    }

}
