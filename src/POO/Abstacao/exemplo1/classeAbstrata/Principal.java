package POO.Abstacao.exemplo1.classeAbstrata;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);

        Retangulo retangulo = new Retangulo(3, 4);

        double areaCirculo = circulo.calcularArea();
        double areaRetangulo = retangulo.calcularArea();

        System.out.println("A area do retangulo é " + areaRetangulo);
        System.out.println("A area do circulo é " + areaCirculo);

        FormaGeometricaAbstract quadrado = new Retangulo(2,2);
        System.out.println("Area do quadrado é " + quadrado.calcularArea());
    }


}
