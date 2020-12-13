package proxy.test5.service;

import proxy.test4.util.DynamicDataSourceEntry;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceProxy {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private void before(Object target) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("Proxy before method");
        Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
        Integer dbRouter =Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态类自动分配到了【DB_" + dbRouter + "】数据源处理数据");
        DynamicDataSourceEntry.set(dbRouter);
    }
    private void after(){
        System.out.println("Proxy after method");
    }
    public Object getProxy(IOderService oderService){
        return Proxy.newProxyInstance(oderService.getClass().getClassLoader(), oderService.getClass().getInterfaces(),(proxy,method,args)->{
            before(args[0]);
            Object result = method.invoke(oderService,args);
            after();
            return result;
        });
    }
}
