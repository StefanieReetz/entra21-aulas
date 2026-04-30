package POO.Polimorfismo.exemplo.tres;

public class Boleto extends MetodoPagamento{
    @Override
    public void pagarAVista() {
        System.out.println("Pagando com Boleto!");
    }
}
