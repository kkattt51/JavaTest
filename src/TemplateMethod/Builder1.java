package TemplateMethod;

class Builder1 extends Worker{
    void build(){
        System.out.println("I'm building roof");
        bricks++;
    }
    void relax() {
        System.out.println("I'm relaxing at home");
        hours += 5;
    }
    int salary(){
        return bricks*100 - hours*10;
    }
}
