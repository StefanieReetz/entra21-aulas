package POO.Heranca.exemplo.dois;

public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public double getSalarioTotal() {
        return this.getSalarioBase() + this.comissao;
    }
}
