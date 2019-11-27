package com.code.singleton.single;

/**
 * 和SingletonTest1 的方式类似，只不过在类实例化过程放在了静态代码块。在类加载的时候，就执行静态代码块中的代码，初始化类的实例。
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Singleton2 s1=Singleton2.getInstance();
        Singleton2 s2=Singleton2.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
class Singleton2{
    //私有化
    private Singleton2(){}

    //本类内部创建实例对象
    private static Singleton2 instance;

    static { //在静态代码块中，创建单例对象
        instance=new Singleton2();
    }
    //提供一个公有的静态方法，返回实例对象
    public static Singleton2 getInstance(){
        return instance;
    }
}

