package TemplateMethod;

abstract class Worker {

    int bricks, foundations, hours;

    final void work() {
        build();
        relax();
        System.out.println(salary());
    }

    abstract void build();

    abstract void relax();

    abstract int salary();
}
