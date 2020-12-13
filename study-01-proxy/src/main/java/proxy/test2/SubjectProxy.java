package proxy.test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SubjectProxy implements InvocationHandler {
    SubjectI subject;
    public Object getInstance(SubjectI subject) {
        this.subject = subject;
        return (SubjectI) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), this);
    }

    public void doBefore() {
        System.out.println("准备");
    }

    public void doAfter() {
        System.out.println("收尾");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doBefore();
        method.invoke(subject, null);
        doAfter();
        return null;
    }
}
