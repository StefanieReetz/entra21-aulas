package POO.Encapsulamento.exemplo2;

public class Estudante {
    private String matricula;
    private double[] notas;

    public Estudante(String matricula) {
        this.matricula = matricula;
        this.notas = new double[4];
    }
    public Estudante (String matricula, int numNotas){
        this.matricula = matricula;
        this.notas = new double[numNotas];
    }
    public void adicionarNota (int posicao, double nota){
        if (posicao < notas.length && posicao >= 0) {
            if (nota >= 0 && nota <= 10) {
                this.notas[posicao] = nota;
            }
        }
    }
    public double calcularMedia(){
        double media = 0;
        for (double nota:notas){
            media += nota;
        }
        media = media / notas.length;
        return media;
    }
}

