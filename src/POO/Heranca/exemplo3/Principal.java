package POO.Heranca.exemplo3;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Bonequinho de Brinquedo");
        produto.setPreco(100d); // esse d é pra nos lembrar q é um double nao é obrigatorio

        produto.exibirInformacoes();

        System.out.println("-------------------------------------");

        Livro livro = new Livro();
        livro.setNome("E não sobrou ninguem");
        livro.setPreco(59.90d);
        livro.setAutor("Agatha Christie");

        livro.exibirInformacoes();
    }
}
