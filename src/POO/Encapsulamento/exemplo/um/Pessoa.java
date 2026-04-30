package POO.Encapsulamento.exemplo.um;

public class Pessoa {
    private String nome;

    public void setNome (String nome){
                          // tamanho da string(as caracteres) forem 0 tipo ""
        if (nome == null || nome.length() == 0) {
            System.out.println("Nao existe nome nulo!!");
        } else {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void apresentar() {
        System.out.println("Meu nome é " + this.nome);
        System.out.println("Meu nome tem " + this.nome.length() + " letras");
    }
}
