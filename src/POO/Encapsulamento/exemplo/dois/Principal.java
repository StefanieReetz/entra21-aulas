package POO.Encapsulamento.exemplo.dois;

public class Principal {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Jennifer", 3);
        estudante.adicionarNota(0,10);
        estudante.adicionarNota(1,8.5);
        estudante.adicionarNota(2, 10);
        System.out.println(estudante.calcularMedia());
    }
}
