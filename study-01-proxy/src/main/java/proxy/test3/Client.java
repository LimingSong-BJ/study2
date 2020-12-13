package proxy.test3;

public class Client {
    public static void main(String[] args) {
        ActionProxy actionProxy = new ActionProxy();
        ActionI action = (ActionI) actionProxy.proxyAction(new Action());
        String name = "jvm";
        float price =0;
        action.findBook(name);
        price = action.buyBook(name);
        System.out.println("花了"+price);
    }}
