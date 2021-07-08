package Visitor;

class Walls implements HouseElement {
    public void accept(HouseElementVisitor visitor) {
        visitor.visit(this);
    }

    public int valueOfVisiting() {
        return 7;
    }
}
