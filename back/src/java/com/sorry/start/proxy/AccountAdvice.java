package com.sorry.start.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AccountAdvice implements InvocationHandler {

    private IAccountService target;

    public AccountAdvice(IAccountService target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        return method.invoke(target, args);
    }

    private void before() {
        System.out.println("身份验证");
    }
}
