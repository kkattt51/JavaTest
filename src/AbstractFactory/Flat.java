package AbstractFactory;

class Flat implements House {
    Flat() {
    }

    public void build() {
        System.out.println("AbstractFactory.Flat is building");
    }
}
