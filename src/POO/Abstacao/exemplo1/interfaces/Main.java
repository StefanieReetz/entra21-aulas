package POO.Abstacao.exemplo1.interfaces;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        Retangulo retangulo = new Retangulo(3,4);

        System.out.println("A area do circulo é " + circulo.calcularArea());
        System.out.println("A area do retalgulo é " + retangulo.calcularArea());

        //Polimorfismo
        IFormaGeometrica iFormaGeometrica = new Circulo(2);

        System.out.println(iFormaGeometrica.calcularArea());
    }
}
