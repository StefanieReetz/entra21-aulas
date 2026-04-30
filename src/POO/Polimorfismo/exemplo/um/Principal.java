package POO.Polimorfismo.exemplo.um;

public class Principal {
    public static void main(String[] args) {
        Animal animalgenerico = new Animal();

        // é um animel com comportamento de cachorro
        Animal chico = new Cachorro();
        // nao tem a especializaçao do cachorro, nao conseguimos usar o metodo perseguir carteiro

        Animal mariaClara = new Gato();

        chico.emitirsom();
        animalgenerico.emitirsom();
        mariaClara.emitirsom();

        Cachorro cachorro = new Cachorro();
        cachorro.perseguirCarteiro();


    }
}
