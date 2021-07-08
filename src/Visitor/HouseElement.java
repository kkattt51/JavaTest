package Visitor;

interface HouseElement {
    void accept(HouseElementVisitor visitor);

    int valueOfVisiting();
}
