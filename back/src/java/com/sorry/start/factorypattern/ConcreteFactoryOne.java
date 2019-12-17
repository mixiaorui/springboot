package com.sorry.start.factorypattern;

public class ConcreteFactoryOne implements AbstractFactory{
    @Override
    public Product newProduct() {
        System.out.println("创建产品1中....");
        return new ProductOne();
    }
}
