package POO.Basico.exemplo;

public class Carro {
    String cor;
    String modelo;
    String marca;
    int ano;
    Pessoa dono;

    public void ligar(){
        if (dono == null) {
            System.out.println("carro sem dono");
        } else {
            dono.apresentar();
            System.out.println("vruuuummmmmmmmm");

        }
    }
}
