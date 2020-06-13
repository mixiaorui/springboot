package com.sorry.start.proxy;

public class ProxyAccount implements IAccountService {

    private IAccountService iAccountService;

    public ProxyAccount(IAccountService iAccountService) {
        this.iAccountService = iAccountService;
    }private void before() {
        System.out.println("身份验证");
    }


    @Override
    public void transfer() {
        before();
        iAccountService.transfer();
    }



}
