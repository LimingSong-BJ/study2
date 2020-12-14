package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private List<Component> components;
    public Composite(String name){
        super(name);
        this.components=new ArrayList<Component>();
    }
    @Override
    public String operation() {
        StringBuilder builder = new StringBuilder(name);
        for(Component component:this.components){
            builder.append("\n");
            builder.append(component.operation());
        }
        return builder.toString();
    }
    public boolean addChild(Component component){
        return components.add(component);
    }
}
