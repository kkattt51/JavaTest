package Composite;

import java.util.ArrayList;
import java.util.List;

class Composite implements House{
    private List<House> components = new ArrayList<>();

    public void addComponent(House component){
        components.add(component);
    }
    public void removeComponent(House component){
        components.remove(component);
    }

    public void build() {
        for(House component: components){
            component.build();
        }
    }
    public List getComponents(){
        return this.components;
    }

    public int getListSize(){
        return components.size();
    }
}
