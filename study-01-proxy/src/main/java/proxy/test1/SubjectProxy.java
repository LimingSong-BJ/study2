package proxy.test1;

public class SubjectProxy implements SubjectI {
    public SubjectI subject;
    public SubjectProxy(SubjectI subject){
        this.subject = subject;
    }
    public void doSomething() {
        doBefore();
        subject.doSomething();
        doAfter();
    }
    private void doBefore(){
        System.out.println("准备");
    }
    private void doAfter(){
        System.out.println("收尾");
    }
}
