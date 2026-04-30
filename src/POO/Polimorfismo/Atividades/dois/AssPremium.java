package POO.Polimorfismo.Atividades.dois;

public class AssPremium extends Assinatura{

    @Override
    public double calcularMensalidade() {
        return super.calcularMensalidade() + 49.99;
    }
}
