package com.sorry.start.factorypattern;

public class Client {

    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        Product product;

        abstractFactory = new ConcreteFactoryOne();

        product = abstractFactory.newProduct();

        product.show();

    }
}
