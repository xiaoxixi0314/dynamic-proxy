package com.github.xiaoxixi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyInvocationHandler implements InvocationHandler {

    private Object object;

    public DynamicProxyInvocationHandler(Object object){
        this.object = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Long startTime = System.currentTimeMillis();
        System.out.println("OrderServiceProxy start:" + startTime);
        Object result =  method.invoke(object, args);
        System.out.println("OrderServiceProxy cost:" + (System.currentTimeMillis()- startTime));
        return result;

    }
}
