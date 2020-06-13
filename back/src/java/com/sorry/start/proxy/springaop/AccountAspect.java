package com.sorry.start.proxy.springaop;

import java.lang.reflect.Method;

public class AccountAspect extends  BaseAspect{

    @Override
    public boolean isIntercept(Method method, Object[] args) throws Throwable {
        return method.getName().equals("transfer");
    }

    @Override
    public void before() throws Throwable {
        System.out.println("对转账人身份进行验证.");
    }


}
