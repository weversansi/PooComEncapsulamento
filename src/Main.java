import br.com.alura.horadapratica.herenca.Animal;
import br.com.alura.horadapratica.herenca.Cachorro;
import br.com.alura.horadapratica.herenca.Carro;
import br.com.alura.horadapratica.herenca.Gato;
import br.com.alura.horadapratica.herenca.bancodigital.ContaBancaria;
import br.com.alura.horadapratica.herenca.bancodigital.ContaCorrente;

public class Main {
    public static void main(String[] args) {

//        ContaBancaria conta1 = new ContaBancaria();
//        IdadePessoa pessoa1 = new IdadePessoa();
//        Produto produto1 = new Produto();
//        Aluno aluno1 = new Aluno();
//        Livro livro1 = new Livro();
//        Livro livro2 = new Livro();
//
//        /*
//        conta1.setSaldo(200);
//        conta1.setNumeroDaconta(0001);
//        conta1.titular = "Weverton";
//
//        System.out.println("Nome: "+conta1.titular+"\nNúmero da conta: "+conta1.getNumeroDaconta()+"\nSaldo: "+conta1.getSaldo());
//
//
//        pessoa1.setNome("Emilly");
//        pessoa1.setIdade(24);
//
//        pessoa1.verificaIdade(pessoa1.getIdade());
//
//
//        produto1.setNome("Banana");
//        produto1.setPreco(12);
//
//        System.out.println("Preço com desconto: "+produto1.aplicaDesconto(10));
//
//        aluno1.setNota1(10);
//        aluno1.setNota2(10);
//        aluno1.setNota3(10);
//
//        System.out.println(aluno1.obtemMediaDoAluno(aluno1.getNota1(), aluno1.getNota2(),aluno1.getNota3()));
//
//         */
//        livro1.setAutor("Jalim Rabei");
//        livro1.setTitulo("Jali Rabamos");
//
//        livro2.setAutor("Emilly");
//        livro2.setTitulo("É nois");
//
//        livro1.exibeInformacoes();
//        livro2.exibeInformacoes();


//        Carro carro1 = new Carro();
//
//        carro1.setNomeDoModelo("Polo");
//        carro1.setPrecoAno1(10000);
//        carro1.setPrecoAno2(20000);
//        carro1.setPrecoAno3(5000);
//
//        System.out.println("O maior preço é: "+ carro1.exibeMaiorPreco());
//        System.out.println("O menor preço é: "+carro1.exibeMenorPreco());
//
//

//        Animal animal1 = new Animal();
//        Cachorro cachorro1 = new Cachorro();
//        Gato gato1 = new Gato();
//
//
//        animal1.emitirSom(); // // Método especifico da classe
//        cachorro1.emitirSom(); // Método sobrescrito da classe Mãe
//        cachorro1.abanarRabo(); // Método especifico da classe
//        gato1.emitirSom(); // Método sobrescrito da classe Mãe
//        gato1.arranharMoveis(); // Método especifico da classe


        ContaBancaria conta1 = new ContaBancaria();
        ContaCorrente contaCorrente = new ContaCorrente();

        conta1.depositaValor(2000);
        conta1.sacaDinheiro(100);
        System.out.println(conta1.consultaSaldo());

        contaCorrente.depositaValor(2000);
        contaCorrente.sacaDinheiro(1999);
        contaCorrente.cobrarTarifaMensal(1);
        System.out.println(contaCorrente.consultaSaldo());
    }

}
