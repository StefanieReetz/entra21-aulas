package POO.Trabalhos.Atividades.Segundo;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {
    public static List<FuncionarioAbstract> funcionarios = new ArrayList<>();


    public static void prcessarFolha(){

        double totalEmpresaPagar = 0;

        System.out.println("\n--- FOLHA DE PAGAMENTO ---");

        for (FuncionarioAbstract funcionario : funcionarios){
            double salario = funcionario.calcularSalario();
            System.out.println(" | Funcionario: "+ funcionario.getNome()+
                    " | Salário: R$"  + salario +
                    " | Cargo: " + funcionario.getCargo());
                    totalEmpresaPagar += salario;

        }
        System.out.println(totalEmpresaPagar);
    }

    public static void adicionarFuncionario(FuncionarioAbstract funcionario) {
        funcionarios.add(funcionario);
    }
}
