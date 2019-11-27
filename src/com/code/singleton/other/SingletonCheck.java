package com.code.singleton.other;

public class SingletonCheck {
    public static void main(String[] args) {
        SingletonCheck01 s=SingletonCheck01.getInstance();
        SingletonCheck01 s1=SingletonCheck01.getInstance();
        System.out.println("======饿汉式---双重检查---线程安全");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s1==s);
    }
}

/**
 * 双重检查
 */
class SingletonCheck01{
    SingletonCheck01(){}

    private static SingletonCheck01 instance;
    //加入双重检查代码，解决线程安全问题，同时解决懒加载问题，同时还保证了效率
    public static SingletonCheck01 getInstance(){
        if(instance==null){
            synchronized (SingletonCheck01.class){
                if(instance==null){
                    instance=new SingletonCheck01();
                }
            }
        }
        return instance;
    }
}
