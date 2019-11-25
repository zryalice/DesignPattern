package segregation;

public class Segreation2 {
    public static void main(String[] args) {
        A a =new A();
        a.depent1(new B());
        a.depent2(new B());
        a.depent3(new B());
        System.out.println("=====使用接口隔离规则=====");
        C c =new C();
        c.depent1(new D());
        c.depent2(new D());
        c.depent3(new D());
    }
}

//1
interface Interface11{
    void option1();
}
interface  Interface2{
    void option2();
    void option3();
}
interface  Interface3{
    void option4();
    void option5();
}

class B implements Interface11,Interface2{
    public void option1(){
        System.out.println("C 实现option1..");
    }
    public void option2(){
        System.out.println("C 实现option2..");
    }
    public void option3(){
        System.out.println("C 实现option3..");
    }
}
class D implements Interface11,Interface3{
    public void option1(){
        System.out.println("A 实现option1..");
    }
    public void option4(){
        System.out.println("A 实现option4..");
    }
    public void option5(){
        System.out.println("A 实现option5..");
    }
}

class A{
    public void depent1(Interface11 i){
        i.option1();
    }
    public void depent2(Interface2 i){
        i.option2();
    }
    public void depent3(Interface2 i){
        i.option3();
    }
}

class C{
    public void depent1(Interface11 i){
        i.option1();
    }
    public void depent2(Interface3 i){
        i.option4();
    }
    public void depent3(Interface3 i){
        i.option5();
    }
}
