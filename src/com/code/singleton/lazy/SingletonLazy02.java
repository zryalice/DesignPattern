package com.code.singleton.lazy;

/**
 * 线程安全， 使用了同步方法
 */
public class SingletonLazy02 {
    public static void main(String[] args) {
        Singleton01 s=Singleton01.getInstance();
        Singleton01 s1=Singleton01.getInstance();
        System.out.println("======饿汉式---同步方法---线程安全");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s1==s);
    }
}
class Singleton01{
    //私有初始化
    private Singleton01(){}

    private static Singleton01 singleton01;

    public  static synchronized Singleton01 getInstance(){
        if(singleton01==null){
            singleton01=new Singleton01();
        }
        return singleton01;
    }
}
