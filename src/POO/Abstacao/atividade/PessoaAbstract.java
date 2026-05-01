package POO.Abstacao.atividade;

public abstract class PessoaAbstract {
    private String nome;
    private int idade;


    public PessoaAbstract(String nome, int idade) {
        this.nome = nome;
        validaIdade(idade);
    }

    public abstract void apresentar();

    private void validaIdade(int idade){
        if (idade > 0 || idade < 150){
            this.idade = idade;
        } else {
            System.out.println("Digite uma idade valida");
        }
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


}
