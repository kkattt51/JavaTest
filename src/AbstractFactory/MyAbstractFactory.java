package AbstractFactory;

public class MyAbstractFactory {
    public MyAbstractFactory() {
    }

    public static void main(String[] var0) {
        String var1 = "AbstractFactory.Cottage";
        Object var2 = null;
        if (var1.equals("AbstractFactory.Cottage")) {
            var2 = new CottageCreator();
        }

        if (var1.equals("AbstractFactory.Flat")) {
            var2 = new FlatCreator();
        }

        House var3 = ((HouseCreator)var2).create();
        var3.build();
    }
}
