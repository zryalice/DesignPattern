package com.code.singleton.lazy;

public class SingletonLazy01 {
    /**
     * 线程不安全
     * @param args
     */
    public static void main(String[] args) {
        Singleton s=Singleton.getInstance();
        Singleton s1=Singleton.getInstance();
        System.out.println("======饿汉式----线程不安全");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s1==s);
    }
}

class Singleton{
    //私有初始化
    private Singleton(){}
    private static Singleton instance;
    //当调用getInstance 才会创建实例对象
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
