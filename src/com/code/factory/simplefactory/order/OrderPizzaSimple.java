package com.code.factory.simplefactory.order;

import com.code.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 使用简单工厂来改造
 */
public class OrderPizzaSimple {
    public OrderPizzaSimple(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    SimpleFactory simpleFactory;
    Pizza pizza=null;
    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType="";
        this.simpleFactory=simpleFactory;
        do{
            orderType=getType();
            pizza=simpleFactory.createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购失败");
                break;
            }
        }while (true);
    }


    private String getType(){
        try {
            BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type :");
            String str=b.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
