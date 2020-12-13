package flyweight.test1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlyweightConcrete implements  FlyweightI{
    private String intrinsicState;

    @Override
    public void operation(String extrinsicState) {
        System.out.println("Object address:" + System.identityHashCode(this));
        System.out.println("IntrinsicState:" + this.intrinsicState);
        System.out.println("ExtrinsicState:" + extrinsicState);
    }
}
