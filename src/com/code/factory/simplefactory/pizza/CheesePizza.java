package com.code.factory.simplefactory.pizza;
/**
 * 只是奶酪的披萨， 如果需要增加榴莲，则需要再新加个类，会麻烦
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给奶酪准备原材料~");
    }
}
