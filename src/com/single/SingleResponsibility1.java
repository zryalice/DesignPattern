package com.single;

/**
 * 方案一：如果单写一个交通工具可行， 但是飞机，轮船不是在公路上运行，这样不合理，就会违反了单一原则 ，
 * 根据交通工具的不同，进行拆分不同类，就需要用到方法级别， 详看SingleResponsibility2
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.run("摩托车");
        v.run("汽车");
        v.run("飞机");
        v.run("轮船");
    }
}

class Vehicle{//交通工具
    public void run(String vehicle){
        System.out.println(vehicle+" 在公路上运行。。。");
    }
}
