package POO.Trabalhos.Atividades.Segundo;

public  abstract class FuncionarioAbstract {
    // Dados: [Nome, Cargo, salarioBase (ou ValorHora), HorasTrabalhadas (se aplicável)]
     String nome;
     double salario;
     String cargo;

    public FuncionarioAbstract(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
}
