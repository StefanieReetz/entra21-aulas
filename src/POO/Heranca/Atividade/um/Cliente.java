package POO.Heranca.Atividade.um;

public class Cliente extends Pessoa{
    private double limiteCompra = 1000;
    private double valorCompra;

    public void comprar(double valorCompra){
        if (this.valorCompra <= this.limiteCompra){
            System.out.println("Pode realizar a compra");
        } else {
            System.out.println("Você passou do limite de compra!");
        }

    }

    public double getValorCompra() {
        return valorCompra;
    }

    public double getLimiteCompra() {
        return limiteCompra;
    }

    public Cliente(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Cliente(String nome, String telefone, double valorCompra) {
        super(nome, telefone);
        this.valorCompra = valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
}
