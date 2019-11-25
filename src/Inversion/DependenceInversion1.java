package Inversion;

/**
 * 使用依赖倒转
 */
public class DependenceInversion1 {
    public static void main(String[] args) {
        Person p=new Person();
        p.receive(new Email());
        p.receive(new WX());
    }
}
//Email
class Email implements  Ireceive{
    public String getInfo(){
        return "电子邮件。。。。";
    };
}
//微信
class WX implements  Ireceive{
    public String getInfo(){
        return "微信。。。。";
    };
}
interface  Ireceive{
    public String getInfo();
}
//完成Person接收消息
//如果再接收微信、短信，就需要写多个方法，Person 类里也会写多个方法,会使代码乱
//解决办法：写一个接口
class Person{
    //之前的写法， 传类
    /*public void receive(Email e){
        System.out.println(e.getInfo());
    }*/

    /**
     * 依赖抽象的接口
     * @param i
     */
    public void receive(Ireceive i){
        System.out.println(i.getInfo());
    }
}