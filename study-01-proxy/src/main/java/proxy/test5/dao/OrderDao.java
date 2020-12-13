package proxy.test5.dao;

import proxy.test4.pojo.Order;
import proxy.test4.util.DynamicDataSourceEntry;

public class OrderDao implements IOrderDao {
    public int insert(Order order){
        System.out.println("使用" + DynamicDataSourceEntry.get() + "数据源");
        System.out.println("OrderDao插入成功");
        return 1;
    }
}
