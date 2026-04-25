package POO.Encapsulamento.Atividades.Dois;

public class Temperatura {
    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return celsius * 1.8 + 32;
    }

    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        }
    }
}
