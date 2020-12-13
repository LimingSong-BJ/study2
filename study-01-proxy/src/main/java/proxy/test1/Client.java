package proxy.test1;

public class Client {
    public static void main(String[] args) {
        SubjectProxy subjectProxy = new SubjectProxy(new Subject1());
        subjectProxy.doSomething();
    }
}
