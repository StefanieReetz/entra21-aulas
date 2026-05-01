package POO.Abstacao.exemplo1.interfaces;

//
public class Retangulo implements IFormaGeometrica {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }
}
