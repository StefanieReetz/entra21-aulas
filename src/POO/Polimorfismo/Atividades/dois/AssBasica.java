package POO.Polimorfismo.Atividades.dois;

public class AssBasica extends Assinatura{

    @Override
    public double calcularMensalidade() {
        return super.calcularMensalidade() + 20.99;
    }
}
