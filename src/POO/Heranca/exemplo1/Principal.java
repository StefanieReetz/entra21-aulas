package POO.Heranca.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("ste",17);
        Aluno aluno = new Aluno("jenn",17,"23hjr832");

        aluno.apresenter();

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("idade do aluno: " + aluno.getIdade());
        System.out.println("Matricula do aluno: " + aluno.getMatricula());
    }
}
