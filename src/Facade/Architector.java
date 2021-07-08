package Facade;

import java.util.ArrayList;
import java.util.List;

class Architector{
    List<Object> workers = new ArrayList<>();
    Driver d = new Driver();
    Painter p = new Painter();
    Builder b = new Builder();

    public void startWorking(){
        workers.add(d);
        workers.add(p);
        workers.add(b);
        d.drive();
        p.paint();
        b.build();
    }

    public List<Object> getWorkers(){
        return this.workers;
    }
}
