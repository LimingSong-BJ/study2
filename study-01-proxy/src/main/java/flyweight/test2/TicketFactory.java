package flyweight.test2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketFactory {
    private static Map<String,TicketI> ticketPool = new ConcurrentHashMap<String,TicketI>();
    public static TicketI queryTicket(String from,String to){
        String key = from+"->"+to;
        if(!ticketPool.containsKey(key)){
            TicketI t = new TicketTrain(from, to);
            ticketPool.put(key,t);
            return t;
        }else {
            System.out.println("使用缓存");
            return ticketPool.get(key);
        }
    }
}
