package POO.Trabalhos.Atividades.Primeiro;

public class Produto {
    //adicionarProduto(nome, preco, qtd);
    private String nome;
    private double preco;
    private int quantidade;// fazer a mudança de string para double, e arrumar todo o restoooooo

    public Produto(String nome, String preco, String quantidade) {
        this.nome = nome;
        this.preco = Double.parseDouble(preco);
        this.quantidade = Integer.parseInt(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
