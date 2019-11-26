package liskov;

public class LiskovTest {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("A 方法中的fun1:"+a.fun1(3,4));

        System.out.println("========B=======");
        B b=new B();
        System.out.println("B方法中的fun1:"+b.fun1(3,4));  //因为B类重写了fun1，所以导致b.fun1 是相加而不是相减操作
        System.out.println("B方法中的fun2:"+b.fun2(2,5));
        System.out.println("=======使用里氏替换规则=====");
        BB bb=new BB();
        System.out.println("B方法中的fun1:"+bb.fun1(3,4));  //因为BB类使用了里氏替换原则，所以会调用A类的fun1，而不是重写
        System.out.println("B方法中的fun2:"+bb.fun2(2,5));
    }
}

class Base{

}

class A{
    public int fun1(int a,int b){
        return a-b;
    }
}
/**
 * 重写了fun1
 */
class B extends  A{
    public int fun1(int a,int b){
        return a+b;
    }
    public int fun2(int a,int b){
        return (a+b)+9;
    }
}

/**
 * 使用了里氏替换原则
 */
class BB extends Base{
    private A a=new A();
    public int fun1(int a, int b){
        return this.a.fun1(a,b);
    }
    public int fun2(int a,int b){
        return (a+b)+9;
    }
}
