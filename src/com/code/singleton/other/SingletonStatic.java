package com.code.singleton.other;

public class SingletonStatic {
    public static void main(String[] args) {
        SingletonCheck01 s=SingletonStatic01.getInstance();
        SingletonCheck01 s1=SingletonStatic01.getInstance();
        System.out.println("======饿汉式---静态内部类---线程安全");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s1==s);
    }
}

class SingletonStatic01{
    private SingletonStatic01(){}//构造器私有化
    private static volatile SingletonCheck01 instance;
    //静态内部类,该类有个静态属性
    private static class SingletonInstance{
        private static final SingletonCheck01 INSTANCE=new SingletonCheck01();
    }
    //提供一个公有的静态方法， 直接返回
    public static synchronized  SingletonCheck01 getInstance(){
        return SingletonInstance.INSTANCE;
    }

}