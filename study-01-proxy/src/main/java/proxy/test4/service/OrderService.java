package proxy.test4.service;

import proxy.test4.dao.OrderDao;
import proxy.test4.pojo.Order;

public class OrderService implements  IOderService{
    private OrderDao orderDao;
    public OrderService(){
        orderDao = new OrderDao();
    }
    public int createOrder(Order order){
        System.out.println("OrderService调用OrderDao");
        return orderDao.insert(order);
    }
}
