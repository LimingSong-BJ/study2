package proxy.test2;

public class Client {
    public static void main(String[] args) {
        SubjectProxy subjectProxy = new SubjectProxy();
        SubjectI subjectI = (SubjectI) subjectProxy.getInstance(new Subject1());
        subjectI.doSomething();

    }
}
