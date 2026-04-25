package POO.Encapsulamento.Atividades.Um;

public class Idade {
    private int anos;

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        if (anos >= 0 && anos <= 150) {
            this.anos = anos;
        } else {
            System.out.println("Idade invalida");
        }
    }
}
