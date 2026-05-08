package POO.Trabalhos.Atividades.Segundo.Model;

import POO.Trabalhos.Atividades.Segundo.FuncionarioAbstract;

public class Gerente extends FuncionarioAbstract {

    public Gerente(String nome, double salarioFixo) {
        super(nome, salarioFixo);
    }

    @Override
    public double calcularSalario() {
        return getSalario();
    }

    @Override
    public String getCargo() {
        return "Gerente";
    }
}
