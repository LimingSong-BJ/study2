package composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Component {
    protected String name;
    public abstract String operation();
    public boolean addChild(Component component){
        throw new UnsupportedOperationException("addChild not supported!");
    }
    public boolean removeChild(Component component){
        throw new UnsupportedOperationException("removeChild not supported!");
    }
    public Component getChild(int index){
        throw new UnsupportedOperationException("getChild not supported");
    }
}
