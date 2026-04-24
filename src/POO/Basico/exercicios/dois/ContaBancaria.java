package POO.Basico.exercicios.dois;

public class ContaBancaria {
    //caracteristicas
    double saldo;

    //construtores
    public ContaBancaria(double saldo){
        if (saldo <= 0){
            System.out.println("Saldo invalido");
            //throw new IllegalArgumentException();
        }
        this.saldo = saldo;
    }

    //metodos
    void depositar (double valor){
        if (valor > 0){
            saldo = saldo + valor;

            System.out.println(saldo);

        } else {
            System.out.println
                    ("Voce só pode depositar um valor acima de 0");
        }
    }


    String sacar (double valor){
        if (valor <= 0){
            return "valor Invalido";
        } else if (valor <= saldo){
            saldo = saldo - valor;
            return "Seu novo saldo é: " + saldo;

        } else {
            return "Você só pode sacar um valor menor ou igual a " + saldo;
        }
    }


}
