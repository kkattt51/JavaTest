package Visitor;

class HouseElementVisitor1 implements HouseElementVisitor {
    public String visit(House house) {
        return "Building house";
    }

    public String visit(Walls walls) {
        return "Painting walls";
    }

    public String visit(Foundation foundation) {return "Filling foundation";
    }

    public String visit(Roof roof) {
        return "Covering roof";
    }
}
