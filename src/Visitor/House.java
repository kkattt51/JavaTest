package Visitor;

import java.util.ArrayList;
import java.util.List;

class House implements HouseElement {
    List<HouseElement> elements;

    public House() {
        this.elements = new ArrayList<>();
        elements.add(new Foundation());
        elements.add(new Walls());
        elements.add(new Walls());
        elements.add(new Roof());
    }

    public void accept(HouseElementVisitor visitor) {
        for (HouseElement elem : elements) {
            elem.accept(visitor);
        }
        visitor.visit(this);
    }
    public int getValueOfVisiting(){
        return elements.get(3).valueOfVisiting();
    }
    public int valueOfVisiting(){return 0;}
}
