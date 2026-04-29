package POO.Heranca.exemplo3;

public class Livro extends Produto{

    private String autor;

    @Override // sobre escrever um metodo, tipo adicionar algo a mais
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Autor: " + this.autor);
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
