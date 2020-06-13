package com.sorry.start.proxy.springaop;


import com.sorry.start.proxy.IAccountService;
import com.sorry.start.proxy.IAccountServiceImpl;
import com.sorry.start.proxy.gclib.AccountAdvice;
import com.sorry.start.proxy.gclib.AccountService;
import org.springframework.cglib.proxy.Enhancer;


public class Client {

    public static void main(String[] args) {
        IAccountService accountService = new IAccountServiceImpl();

        IAccountService accountService1 = (IAccountService)Enhancer.create(accountService.getClass(),new AccountAspect());
        accountService1.transfer();

    }

}
