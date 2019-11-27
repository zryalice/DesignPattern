package com.code.factory.simplefactory.order;

import com.sun.org.apache.xpath.internal.operations.Or;

public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza();// 如果要是新加个LisaPizza 则需要再新写一个类
        new OrderPizzaSimple(new SimpleFactory());   //使用简单工厂模式
    }
}
