package POO.Trabalhos.Atividades.Segundo;

import POO.Trabalhos.Atividades.Segundo.Model.Estagiario;
import POO.Trabalhos.Atividades.Segundo.Model.Gerente;

public class Main {
    public static void main(String[] args) {
        FuncionarioService.adicionarFuncionario(new Gerente("Stefanie", 10_000));
        FuncionarioService.adicionarFuncionario(new Estagiario("Jennifer", 10,200));
        FuncionarioService.adicionarFuncionario(new Estagiario("Simone", 9,200));
    }
}
