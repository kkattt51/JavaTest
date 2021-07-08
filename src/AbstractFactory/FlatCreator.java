package AbstractFactory;

class FlatCreator implements HouseCreator {
    FlatCreator() {
    }

    public Flat create() {
        return new Flat();
    }
}

