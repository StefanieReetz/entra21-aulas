package POO.Abstacao.atividade;

public class Professor extends PessoaAbstract{

    private String materia;

    @Override
    public void apresentar() {
        System.out.println("Olá meu nome é "+ this.getNome()+
                ", tenho "+ this.getIdade() + " anos e minha materia é "+
                this.materia);
    }

    public Professor(String nome, int idade, String materia) {//construtor
        super(nome, idade);
        this.materia = materia;
    }
}
