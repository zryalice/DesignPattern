package com.code.singleton.other;

public class SingletonEnum {
    public static void main(String[] args) {
        SingleEnum s=SingleEnum.INSTANCE;
        s.say();
        SingleEnum s1=SingleEnum.INSTANCE;
        System.out.println("======饿汉式---枚举---线程安全");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s1==s);
    }
}

enum SingleEnum{
    INSTANCE;
    public void say(){
        System.out.println("====ok====");
    }

}
