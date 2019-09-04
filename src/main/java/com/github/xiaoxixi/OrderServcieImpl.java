package com.github.xiaoxixi;

public class OrderServcieImpl implements OrderService {
    @Override
    public OrderDO queryOrder(OrderQuery query) {
        OrderDO order = new OrderDO();
        order.setOrderNo(query.getOrderNo());
        order.setSubject("test");
        order.setTotal(100L);
        return order;
    }
}
