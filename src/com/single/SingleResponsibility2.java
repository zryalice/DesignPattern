package com.single;

/**
 * 方案2：
 * 遵守单一原则 ，
 * 可以写多个方法， 但是改动很大，可以直接修改成方法级别， 详看singleresponsibility3
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVechicle roadVechicle=new RoadVechicle();
        roadVechicle.run("摩托车");
        AirVechicle air=new AirVechicle();
        air.run("飞机");
    }
}

class RoadVechicle{
    public void run(String vechicle){
        System.out.println(vechicle+"在公路上。。。");
    }
}

class AirVechicle{
    public void run(String airvechicle){
        System.out.println(airvechicle+"在天空上。。。");
    }
}

class WaterVechicle{
    public void run(String watervechicle){
        System.out.println(watervechicle+"在水里。。。");
    }
}
