package POO.Trabalhos.Segundo;

import POO.Trabalhos.Segundo.Service.ProdutoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProdutoService produtoService = new ProdutoService();
        int opcao;
        do {
            Menu.exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    String preco = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    String qtd = scanner.nextLine();
                    produtoService.adicionarProduto(nome, preco, qtd);
                    break;
                case 2:
                    produtoService.listarProdutos();
                    break;
                case 3:
                    produtoService.calcularTotal();
                    break;
            }
        } while (opcao != 0);

    }
}
