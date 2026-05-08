package POO.Trabalhos.Atividades.Segundo.Model;

import POO.Trabalhos.Atividades.Segundo.FuncionarioAbstract;

public class Estagiario extends FuncionarioAbstract {
    private int horasTrabalhadas;

    public Estagiario(String nome, double valorHora, int horasTrabalhadas) {
        super(nome,valorHora);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return getSalario() * this.horasTrabalhadas;
    }

    @Override
    public String getCargo() {
        return "Estagiario";
    }
}
