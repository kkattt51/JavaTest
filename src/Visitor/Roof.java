package Visitor;

class Roof implements HouseElement {
    public void accept(HouseElementVisitor visitor) {
        visitor.visit(this);
    }

    public int valueOfVisiting() {
        return 5;
    }
}
