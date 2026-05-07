package POO.Trabalhos.Segundo;

public class Produto {
    //adicionarProduto(nome, preco, qtd);
    private String nome;
    private String preco;
    private String quantidade;

    public Produto(String nome, String preco, String quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getPreco() {
        return preco;
    }

    public String getQuantidade() {
        return quantidade;
    }
}
