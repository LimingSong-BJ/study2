package flyweight.test1;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        FlyweightI flyweight1 = flyweightFactory.getFlyweight("bb");
        FlyweightI flyweight2 = flyweightFactory.getFlyweight("bb");
        flyweight1.operation("a");
        flyweight2.operation("ccc");
    }

}
