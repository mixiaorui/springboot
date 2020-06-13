package com.sorry.start.proxy.gclib;


import org.springframework.cglib.proxy.Enhancer;


public class Client {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();

        AccountService accountService1 = (AccountService)Enhancer.create(accountService.getClass(),new AccountAdvice());
        accountService1.transfer();

    }

}
