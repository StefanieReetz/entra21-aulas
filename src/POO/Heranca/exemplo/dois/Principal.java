package POO.Heranca.exemplo.dois;

public class Principal {
    public static void main(String[] args) {
        Vendedor vendedor= new Vendedor
                ("Jean",10_000d,50_000d);
        System.out.println("O salário tota de " + vendedor.getNome() + " é " + vendedor.getSalarioTotal());
    }
}
