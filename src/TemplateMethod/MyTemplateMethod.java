package TemplateMethod;

public class MyTemplateMethod {
    public static void main(String[] args) {
        Worker builder1 = new Builder1();
        builder1.work();

        Worker builder2 = new Builder2();
        builder2.work();
    }
}

