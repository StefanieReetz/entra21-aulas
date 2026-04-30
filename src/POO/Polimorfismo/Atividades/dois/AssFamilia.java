package POO.Polimorfismo.Atividades.dois;

public class AssFamilia extends Assinatura{

    @Override
    public double calcularMensalidade() {
        return super.calcularMensalidade() + 79.99;
    }
}
