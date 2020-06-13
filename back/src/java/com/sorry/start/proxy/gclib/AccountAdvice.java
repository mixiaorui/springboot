package com.sorry.start.proxy.gclib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class AccountAdvice implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        return methodProxy.invokeSuper(o, objects);
    }

    private void before() {
        System.out.println("对转账人身份进行验证.");
    }
}
