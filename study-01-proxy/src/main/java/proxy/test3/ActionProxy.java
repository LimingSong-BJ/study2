package proxy.test3;

import java.lang.reflect.Proxy;

public class ActionProxy {
    public Object proxyAction(ActionI action){
        return Proxy.newProxyInstance(action.getClass().getClassLoader(),action.getClass().getInterfaces(),(proxy,method,args)->{
            Object result = null;
            if("buyBook".equals(method.getName())){
                doBefore();
                result = method.invoke(action,args);
                doAfter();
                return result;
            }
            return method.invoke(action,args);
        });
    }
    private void doBefore(){
        System.out.println("进入书店");
    }
    private void doAfter(){
        System.out.println("离开书店");
    }
}
