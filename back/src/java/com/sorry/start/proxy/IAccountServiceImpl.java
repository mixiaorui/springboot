package com.sorry.start.proxy;

public class IAccountServiceImpl implements IAccountService{
    @Override
    public void transfer() {
        System.out.println("转账！");
    }
}
