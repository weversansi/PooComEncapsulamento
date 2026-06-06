import br.com.alura.horadapratica.atividades.*;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        IdadePessoa pessoa1 = new IdadePessoa();
        Produto produto1 = new Produto();
        Aluno aluno1 = new Aluno();
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        /*
        conta1.setSaldo(200);
        conta1.setNumeroDaconta(0001);
        conta1.titular = "Weverton";

        System.out.println("Nome: "+conta1.titular+"\nNúmero da conta: "+conta1.getNumeroDaconta()+"\nSaldo: "+conta1.getSaldo());


        pessoa1.setNome("Emilly");
        pessoa1.setIdade(24);

        pessoa1.verificaIdade(pessoa1.getIdade());


        produto1.setNome("Banana");
        produto1.setPreco(12);

        System.out.println("Preço com desconto: "+produto1.aplicaDesconto(10));

        aluno1.setNota1(10);
        aluno1.setNota2(10);
        aluno1.setNota3(10);

        System.out.println(aluno1.obtemMediaDoAluno(aluno1.getNota1(), aluno1.getNota2(),aluno1.getNota3()));

         */
        livro1.setAutor("Jalim Rabei");
        livro1.setTitulo("Jali Rabamos");

        livro2.setAutor("Emilly");
        livro2.setTitulo("É nois");

        livro1.exibeInformacoes();
        livro2.exibeInformacoes();

    }

}
