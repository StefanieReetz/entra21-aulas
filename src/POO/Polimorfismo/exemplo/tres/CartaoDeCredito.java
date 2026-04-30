package POO.Polimorfismo.exemplo.tres;

public class CartaoDeCredito extends MetodoPagamento{
    @Override
    public void pagarAVista() {
        System.out.println("Pagando com cartão de crédito!");
    }
}
