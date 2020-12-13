package proxy.test3;


public class Action implements ActionI{
    @Override
    public float buyBook(String name) {
        System.out.println("买了本书"+name);
        return 38;
    }

    @Override
    public String findBook(String name) {
        System.out.println("找到了" + name);
        return name;
    }
}
