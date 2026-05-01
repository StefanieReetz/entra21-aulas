package POO.Abstacao.atividade;

public class Aluno extends PessoaAbstract{

    private int serie;

    public Aluno(String nome, int idade, int serie) {
        super(nome, idade);
        this.serie = serie;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá meu nome é "+ this.getNome()+
                ", tenho "+ this.getIdade() + "anos e minha serie é "+
                this.serie);
    }
}
