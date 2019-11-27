package com.code.factory.simplefactory.order;

import com.code.factory.simplefactory.pizza.CheesePizza;
import com.code.factory.simplefactory.pizza.GreekPizza;
import com.code.factory.simplefactory.pizza.Pizza;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    //构造器 披萨的单，
    public OrderPizza(){
        Pizza pizza=null;
        String orderType;
        do{
            orderType=getType();
            if (orderType.equals("greek")){
                pizza=new GreekPizza();
                pizza.setName("希腊");
            }else if(orderType.equals("cheese")){
                pizza=new CheesePizza();
                pizza.setName("奶酪");
            }else{
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    //写一个方法，可以获取用户希望的种类， 在控制台输入披萨的种类
    private String getType(){
        try {
            BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type :");
            String str= null;
            str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
