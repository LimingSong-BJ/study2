package factoryMethod;

public class Client {
    public static void main(String[] args) {
        CourseFactoryI courseFactoryI = new CourseFactoryJava();
        courseFactoryI.create().doSomething();
    }

}
