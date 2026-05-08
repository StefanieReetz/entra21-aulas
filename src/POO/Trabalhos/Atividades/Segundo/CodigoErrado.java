package POO.Trabalhos.Atividades.Segundo;

import java.util.ArrayList;
import java.util.List;

public class CodigoErrado {
    // Dados: [Nome, Cargo, salarioBase (ou ValorHora), HorasTrabalhadas (se
   // aplicável)]

    private static List<Object[]> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
// Adicionando funcionários de tipos diferentes

        funcionarios.add(new Object[]{"João", "Gerente", 5000.0, 0});
        funcionarios.add(new Object[]{"Maria", "Estagiario", 20.0, 160}); //       20/hora * 160h

        funcionarios.add(new Object[]{"Carlos", "Gerente", 6000.0, 0});
        processarFolha();
    }
    public static void processarFolha() {
        System.out.println("\n--- FOLHA DE PAGAMENTO ---");
        double totalEmpresa = 0;
        for (Object[] f : funcionarios) {
            String nome = (String) f[0];
            String cargo = (String) f[1];
            double param1 = (Double) f[2]; // Salario ou Valor Hora
            int param2 = (Integer) f[3]; // Horas
            double salarioFinal = 0;
// Lógica procedural baseada no tipo (cargo)
            if (cargo.equals("Gerente")) {
                salarioFinal = param1; // Salário fixo
            } else if (cargo.equals("Estagiario")) {
                salarioFinal = param1 * param2; // Hora * Quantidade
            } else {
                System.out.println("Cargo desconhecido: " + cargo);
            }
            System.out.println("Funcionário: " + nome + " | Salário: R$" +
                    salarioFinal);
            totalEmpresa += salarioFinal;
        }
        System.out.println("Total a pagar: R$" + totalEmpresa);
    }

}
