package TemplateMethod;

class Builder2 extends Worker{
    void build(){
        System.out.println("I'm building foundation");
        foundations++;
    }
    void relax() {
        System.out.println("I'm relaxing at work");
        hours += 7;
    }
    int salary(){
        return foundations*200 - hours*20;
    }
}
