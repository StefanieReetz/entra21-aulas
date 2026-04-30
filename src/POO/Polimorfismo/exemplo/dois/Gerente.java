package POO.Polimorfismo.exemplo.dois;

public class Gerente extends Funcionario{

    @Override
    public double calcularPagamento() {
        return super.calcularPagamento() + 1_000d;
    }
}
