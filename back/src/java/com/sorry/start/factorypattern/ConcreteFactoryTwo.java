package com.sorry.start.factorypattern;

public class ConcreteFactoryTwo implements AbstractFactory{
    @Override
    public Product newProduct() {
        System.out.println("创建产品2中....");
        return new ProductTwo();
    }
}
