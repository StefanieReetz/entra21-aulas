package POO.Basico.exercicios.um;

public class Aluno {
    String nome;
    int idade;

    public Aluno (){}
    public Aluno (String nome, int idade){
        nome = this.nome;
        idade = this.idade;
    }

    void estudar(){
        System.out.println("Estou estudando!");
    }
}
