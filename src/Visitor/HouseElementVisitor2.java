package Visitor;

class HouseElementVisitor2 implements HouseElementVisitor {
    public String visit(House house) {
        return "Building house2";
    }

    public String visit(Walls walls) {
        return "Painting walls2";
    }

    public String visit(Foundation foundation) {
        return "Filling foundation2";
    }

    public String visit(Roof roof) {
        return "Covering roof2";
    }
}
