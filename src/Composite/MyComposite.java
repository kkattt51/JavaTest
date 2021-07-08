package Composite;

public class MyComposite{
    public static void main(String args[]){
        House foundation1 = new Foundation();
        House foundation2 = new Foundation();

        House wall1 = new Walls();
        House wall2 = new Walls();
        House wall3 = new Walls();
        House wall4 = new Walls();

        House roof1 = new Roof();
        House roof2 = new Roof();

        Composite composite = new Composite();
        Composite composite1 = new Composite();

        composite.addComponent(foundation1);
        composite.addComponent(wall1);
        composite.addComponent(wall2);
        composite1.addComponent(roof1);

        composite1.addComponent(foundation2);
        composite1.addComponent(wall3);
        composite1.addComponent(wall4);
        composite1.addComponent(roof2);

        foundation1.build();
    }
}

