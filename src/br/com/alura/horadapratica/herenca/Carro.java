package br.com.alura.horadapratica.herenca;

public class Carro {
    private String nomeDoModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;


    public String getNomeDoModelo() {
        return nomeDoModelo;
    }

    public void setNomeDoModelo(String nomeDoModelo) {
        this.nomeDoModelo = nomeDoModelo;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    public double exibeMenorPreco(){
        double menorPreco = precoAno1;

        if ( precoAno2 < menorPreco ) {
            menorPreco = precoAno2;

        }
        if ( precoAno3 < menorPreco ) {
            menorPreco = precoAno3;

        }

        return menorPreco;

    }

    public double exibeMaiorPreco(){
        double maiorPreco = this.precoAno1;

        if ( this.precoAno2 > maiorPreco ){
            maiorPreco = this.precoAno2;

        }
        if ( this.precoAno3 > maiorPreco ){
            maiorPreco = precoAno3;

        }

        return  maiorPreco;

    }
}
