package POO.Abstacao.exemplo2;

public abstract class PagamentoAbstract {
    private double valor;

    public PagamentoAbstract(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public abstract void processar();
}
