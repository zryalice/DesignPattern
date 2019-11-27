package com.code.singleton.single;

/**
 * //饿汉式（静态变量）   会造成内存浪费，
 * 有第二种写法，代码块，详看SingletonTest2
 *
 * 优缺点：
 * 优点：写法简单，在类装载的时候就完成了实例化。避免了线程同步的问题
 * 缺点：在类加载的时候就完成实例化，没有达到Lazy Loading效果，如果从始至终都没有使用，会造成内存浪费
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton s=Singleton.getInstance();
        Singleton s1=Singleton.getInstance();
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s1==s);
    }
}
//饿汉式（静态变量）
class Singleton{
    //1.构造器私有化，外部能new
    private Singleton(){}
    //2.本类内部创建实例
    private final static Singleton instance=new Singleton();

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}