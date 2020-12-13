package proxy.test4.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import proxy.test4.pojo.Order;
import proxy.test4.util.DynamicDataSourceEntry;

import java.text.SimpleDateFormat;
import java.util.Date;

@RequiredArgsConstructor
public class OrderServiceProxy implements IOderService{
    @NonNull
    private IOderService orderService;
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private void before(){
        System.out.println("Proxy before method");
    }
    private void after(){
        System.out.println("Proxy after method");
    }
    @Override
    public int createOrder(Order order) {
        before();
        Long time = order.getCreateTime();
        Integer dbRouter =Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态类自动分配到了【DB_" + dbRouter + "】数据源处理数据");
        DynamicDataSourceEntry.set(dbRouter);
        orderService.createOrder(order);
        after();
        return 0;
    }
}
