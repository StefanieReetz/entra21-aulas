package POO.Basico.exercicios.dois;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(100);

        conta1.sacar(33);
        conta1.depositar(1111);
    }
}
