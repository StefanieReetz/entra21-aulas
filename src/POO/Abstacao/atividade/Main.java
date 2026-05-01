package POO.Abstacao.atividade;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("maria", 14, 8);
        Professor professor = new Professor("Cleber", 46, "Matematica");

        professor.apresentar();
        aluno.apresentar();


    }
}
