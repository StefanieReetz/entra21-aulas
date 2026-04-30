package POO.Polimorfismo.exemplo.tres;

public class Pix extends MetodoPagamento{
    @Override
    public void pagarAVista() {
        System.out.println("Pagando com PIX!");
    }
}
