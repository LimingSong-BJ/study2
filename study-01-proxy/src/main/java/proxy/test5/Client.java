package proxy.test5;

import proxy.test4.pojo.Order;
import proxy.test4.service.IOderService;
import proxy.test4.service.OrderService;
import proxy.test4.service.OrderServiceProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public static void main(String[] args) throws ParseException {
        Order order = new Order();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date =  sdf.parse("2017/02/01");
        order.setCreateTime(date.getTime());
        IOderService oderService = new OrderServiceProxy(new OrderService());
        oderService.createOrder(order);
    }
}
