package br.com.alura.horadapratica.atividades;

public class Livro {
    private String titulo;
    private String autor;


    public void exibeInformacoes(){
        System.out.println("""
                TÍTULO: %s
                AUTOR: %s
                """.formatted(titulo, autor));
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
