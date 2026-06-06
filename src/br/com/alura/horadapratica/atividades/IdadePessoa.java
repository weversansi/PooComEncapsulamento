package br.com.alura.horadapratica.atividades;

public class IdadePessoa {
    private int idade;
    private String nome;

    public void verificaIdade(int idade){
        this.idade = idade;

        if (this.idade > 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
