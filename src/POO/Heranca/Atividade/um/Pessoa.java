package POO.Heranca.Atividade.um;

public class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone.length() == 9){
            this.telefone = telefone;
        } else {
            System.out.println("escreva no formato 9XXXXXXXX");
        }

    }


}
