package POO.Basico.exemplo;
// FUNÇAO Q A CLASSE PESSOA TEM(que ela consegue fazer),
// QUANDO FOR CRIAR UM OBJETO(um em especifico, tipo vou criar eu, dai eu sou um objeto, a classe é o molde para criar uma pessoa)
// ELE VAI TER ESSA FUNÇAO DENTRO DELE
public class Pessoa {
    String nome;
    int idade;
    double peso;

    // CONSTRUTOR VAZIO
    public Pessoa(){}

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar(){
        System.out.println("Olá meu nome é " + this.nome +
                            "e tenho " + this.idade + " anos");
    }
}
