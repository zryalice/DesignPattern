package segregation;

/**
 * 类A实现接口1，2，3   其中4，5 是不必要的，有点多余  通过隔离原则，来简单化，详看segregation2
 */
public class Segregation1 {
    public static void main(String[] args) {
        AA a =new AA();
        a.depend1(new BB());
        a.depend2(new BB());
        a.depend3(new BB());
        System.out.println("==================");
        CC c=new CC();
        c.depend1(new DD());
        c.depend4(new DD());
        c.depend5(new DD());
    }
}
//5个接口
interface Interface1{
    void option1();
    void option2();
    void option3();
    void option4();
    void option5();
}
//类A实现接口1，2，3   其中4，5 是不必要的，有点多余
class BB implements Interface1{
    public void option1(){
        System.out.println("B实现了option1");
    }
    public void option2(){
        System.out.println("B实现了option2");
    }
    public void option3(){
        System.out.println("B实现了option3");
    }
    public void option4(){
        System.out.println("B实现了option4");
    }
    public void option5(){
        System.out.println("B实现了option5");
    }
}
//类C实现接口1,4,5   其中2,3 是不必要的，有点多余
class DD implements Interface1{
    public void option1(){
        System.out.println("C实现了option1");
    }
    public void option2(){
        System.out.println("C实现了option2");
    }
    public void option3(){
        System.out.println("C实现了option3");
    }
    public void option4(){
        System.out.println("C实现了option4");
    }
    public void option5(){
        System.out.println("C实现了option5");
    }
}

class AA{ //A类通过接口INterface 只会用到1,2,3方法
    public void depend1(Interface1 i){
        i.option1();
    }
    public void depend2(Interface1 i){
        i.option2();
    }
    public void depend3(Interface1 i){
        i.option3();
    }
}

class CC{//C类通过接口INterface 只会用到1,4,5方法
    public void depend1(Interface1 i){
        i.option1();
    }
    public void depend4(Interface1 i){
        i.option4();
    }
    public void depend5(Interface1 i){
        i.option5();
    }
}
