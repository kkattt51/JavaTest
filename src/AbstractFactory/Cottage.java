package AbstractFactory;

class Cottage implements House {
    Cottage() {
    }

    public void build() {
        System.out.println("AbstractFactory.Cottage is building");
    }
}
