package POO.Encapsulamento.Atividades.Dois;

public class Principal {
    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura();

        temperatura.setCelsius(0);

        System.out.println(temperatura.getFahrenheit());
    }
}
