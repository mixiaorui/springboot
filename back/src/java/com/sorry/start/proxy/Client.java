package com.sorry.start.proxy;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        IAccountService iAccountService = new IAccountServiceImpl();

        //静态代理
        /*IAccountService iAccountService1 = new ProxyAccount(iAccountService);*/

        //动态代理jdk
        IAccountService iAccountService1 = (IAccountService)Proxy.newProxyInstance(iAccountService.getClass().getClassLoader(), iAccountService.getClass().getInterfaces(),
                new AccountAdvice(iAccountService));

        iAccountService1.transfer();

    }

}
