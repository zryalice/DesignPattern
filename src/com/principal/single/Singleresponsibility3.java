package com.principal.single;

/**
 * 方案3：遵守单一原则 ， 在方法级别遵守单一
 * 代码写的少， 前提是类中方法数量足够少，如果方法太多，则需要按类进行遵守单一原则
 */
public class Singleresponsibility3 {
    public static void main(String[] args) {
        VehicleAll v=new VehicleAll();
        v.roadrun("汽车");
        v.airdrun("飞机");
        v.waterrun("轮船");
    }

}

class VehicleAll{
    public void roadrun(String vehicle){
        System.out.println(vehicle+" 在公路上。。。。");
    }
    public void airdrun(String vehicle){
        System.out.println(vehicle+" 在天空上。。。。");
    }
    public void waterrun(String vehicle){
        System.out.println(vehicle+" 在水里。。。。");
    }
}

