package POO.Polimorfismo.Atividades.dois;

public class Principal {
    public static void main(String[] args) {
        Assinatura free = new Assinatura();
        Assinatura premium = new AssPremium();
        Assinatura familia = new AssFamilia();
        Assinatura basica = new AssBasica();

        System.out.println("O preço das assinaturas sao:\n" + free.calcularMensalidade() + "\n"
        + basica.calcularMensalidade() + "\n"+ premium.calcularMensalidade() + "\n" + familia.calcularMensalidade());
    }
}
