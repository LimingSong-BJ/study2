package flyweight.test2;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Random;

@RequiredArgsConstructor
public class TicketTrain implements TicketI{
    @NonNull private String from;
    @NonNull private String to;
    private int price;
    @Override
    public void showInfo(String bunk) {
        this.price = new Random().nextInt(500);
        System.out.println(String.format("%s->%s: %s 价格:%s 元", this.from, this.to, bunk,this.price));
    }
}
