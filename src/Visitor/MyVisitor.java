package Visitor;

public class MyVisitor{
    public static void main(final String[] args) {
        final House house= new House();

        house.accept(new HouseElementVisitor1());
        house.accept(new HouseElementVisitor2());
    }
}

