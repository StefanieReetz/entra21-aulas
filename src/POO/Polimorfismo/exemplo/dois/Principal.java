package POO.Polimorfismo.exemplo.dois;

public class Principal {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        gerente.setSalarioBase(10000);
        System.out.println("O salário do gerente é: "+ gerente.calcularPagamento());

        Funcionario funcionarioComum = new Funcionario();
        funcionarioComum.setSalarioBase(3000);
        System.out.println("O salário do funcionário é: " + funcionarioComum.calcularPagamento());
        Funcionario vendedor = new Vendedor(2000, 2000);
        System.out.println("Salário do vendedor é: "+ vendedor.calcularPagamento());

    }
}
