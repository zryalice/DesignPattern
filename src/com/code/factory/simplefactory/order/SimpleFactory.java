package com.code.factory.simplefactory.order;

import com.code.factory.simplefactory.pizza.CheesePizza;
import com.code.factory.simplefactory.pizza.GreekPizza;
import com.code.factory.simplefactory.pizza.Pizza;

/**
 * 使用简单工厂，创建多个如OrderPizza1,OrderPizza2，则都直接使用工厂
 */
public class SimpleFactory {
    //使用简单工厂模式创建
    public Pizza createPizza(String orderType){
        Pizza pizza=null;
        System.out.println("=====使用简单工厂模式");
        if(orderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName("希腊");
        }else if(orderType.equals("cheese")){
            pizza=new CheesePizza();
            pizza.setName("奶酪");
        }
        return pizza;
    }
}
