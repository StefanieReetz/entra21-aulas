package POO.Abstacao.exemplo1.classeAbstrata;
// colocar o nome assim é coesao para nos sabermos q ela é abstrata, qnd nos for chamar ela
public abstract class FormaGeometricaAbstract {
    abstract double calcularArea();
    // nao tem chaves em metodos abstratos, porq a logica vai estar em outro lugar,
    // q sao as classes especializadas, no caso as subclasses ou classes filhas
}
