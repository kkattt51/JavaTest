package AbstractFactory;

class CottageCreator implements HouseCreator {
    CottageCreator() {
    }

    public House create() {
        return new Cottage();
    }
}
