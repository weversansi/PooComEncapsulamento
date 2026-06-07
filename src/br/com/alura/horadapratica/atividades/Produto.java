package br.com.alura.horadapratica.atividades;

public class Produto {
    private String nome;
    private double preco;

    public double aplicaDesconto(double desconto){

        return preco-(preco*(desconto/100));
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
