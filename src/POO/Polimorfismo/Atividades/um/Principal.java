package POO.Polimorfismo.Atividades.um;

public class Principal {
    public static void main(String[] args) {
        Instrumento violao = new Violao();
        violao.tocar();

        Instrumento bateria = new Bateria();
        bateria.tocar();

        Instrumento piano = new Piano();
        piano.tocar();
    }
}
