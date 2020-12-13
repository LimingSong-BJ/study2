package flyweight.test1;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String,FlyweightI> pool = new HashMap<String,FlyweightI>();

    public  FlyweightI getFlyweight(String intrinsicState){
        if(!pool.containsKey(intrinsicState)){
            FlyweightI flyweight = new FlyweightConcrete(intrinsicState);
            pool.put(intrinsicState,flyweight);
        }
        return pool.get(intrinsicState);
    }
}
