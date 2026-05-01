package POO.Abstacao.exemplo1.classeAbstrata;

public class Retangulo extends FormaGeometricaAbstract{
    private double altura;
    private double largura;

    // sempre q for instanciada a classe
    // a altura  e a largura serao obrigatorios

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    double calcularArea() {
        return altura * largura;
    }
}
