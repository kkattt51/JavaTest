package Visitor;

interface HouseElementVisitor {
    String visit(Foundation f);
    String visit(Walls w);
    String visit(Roof r);
    String visit(House h);

}
