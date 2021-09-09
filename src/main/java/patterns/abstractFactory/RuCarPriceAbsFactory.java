package patterns.abstractFactory;

class RuCarPriceAbsFactory implements InteAbsFactory {
    public Lada getLada() {
        return new RuLadaImpl();
    }

    public Ferrari getFerrari() {
        return new RuFerrariImpl();
    }

    public Porshe getPorshe() {
        return new RuPorsheImpl();
    }
}
