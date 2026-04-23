package POO.Basico.exemplo;

// geralmente colocam server
public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Stefanie", 17);
//        pessoa1.nome = "Stefanie";
//        pessoa1.idade = 17;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Solange";
        pessoa2.idade = 60;

      //  pessoa1.apresentar();
      //  pessoa2.apresentar();

        Carro carro1 = new Carro();
        carro1.ano = 1994;
        carro1.cor = "vermelho";
        carro1.marca = "Mazda";
        carro1.modelo = "Miata MX-5";
        carro1.dono = pessoa1;
    }
}
