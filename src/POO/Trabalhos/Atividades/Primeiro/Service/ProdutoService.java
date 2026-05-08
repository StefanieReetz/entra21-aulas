package POO.Trabalhos.Atividades.Primeiro.Service;

import POO.Trabalhos.Atividades.Primeiro.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();


    public void adicionarProduto(String nome,
                                 String preco,
                                 String quantidade) {

        Produto produto = new Produto(nome,
                preco,
                quantidade);

        produtos.add(produto);
        System.out.println("Produto adicionado!");

    }


    public void listarProdutos() {
        System.out.println("\n--- Lista de Produtos ---");

        if (produtos.isEmpty()) {

                        System.out.println("Nenhum produto cadastrado.");

                        return;

                    }

        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + " | Preço: R$" + produto.getPreco() +
                    " | Qtd: " + produto.getQuantidade());
        }
    }

    public void calcularTotal() {
        double total = 0;

        for (Produto produto : produtos) {
            double preco = produto.getPreco();
            int qtd = produto.getQuantidade();
            total += preco * qtd;
        }

        System.out.println("Valor total do estoque: R$ " + total);
    }

}
