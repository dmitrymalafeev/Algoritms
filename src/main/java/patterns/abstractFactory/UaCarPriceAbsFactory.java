package patterns.abstractFactory;

class UaCarPriceAbsFactory implements InteAbsFactory {
    public Lada getLada() {
        return new UaLadaImpl();
    }

    public Ferrari getFerrari() {
        return new UaFerrariImpl();
    }

    public Porshe getPorshe() {
        return new UaPorsheImpl();
    }
}// первая
