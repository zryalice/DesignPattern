package com.code.singleton.lazy;

public class SingletonLazy03 {
    public static void main(String[] args) {
        Singleton03 s=Singleton03.getInstance();
        Singleton03 s1=Singleton03.getInstance();
        System.out.println("======饿汉式---同步代码块---线程安全");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s1==s);
    }
}
class Singleton03{
    private Singleton03(){}
    private static Singleton03 instance;
    public static Singleton03 getInstance(){
        if(instance==null){
            synchronized (Singleton03.class){
                instance=new Singleton03();
            }
        }
        return instance;
    }
}
