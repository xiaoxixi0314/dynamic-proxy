package com.github.xiaoxixi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestProxy {

    public static void main(String[] args) {
        OrderService orderService = new OrderServcieImpl();
        InvocationHandler invocationHandler = new DynamicProxyInvocationHandler(orderService);

        OrderQuery orderQuery = new OrderQuery();
        orderQuery.setOrderNo("124565856");

        OrderService orderServiceProxy =  (OrderService)Proxy.newProxyInstance(OrderService.class.getClassLoader(),
                new Class[]{OrderService.class}, invocationHandler);
        orderServiceProxy.queryOrder(orderQuery);

    }
}
