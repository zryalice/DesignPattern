package com.principal.Inversion;

/**
 * 依赖反转的3种传递方式
 */
public class DependenceInversion2 {
    public static void main(String[] args) {
        //  方式一：
        /*ChangHong c=new ChangHong();
        OpenAndClose op=new OpenAndClose();
        op.open(c);*/

        //方式二：
        /*Changhong c=new Changhong();
        OpenAndClose op=new OpenAndClose(c);//构造器， 参数为c
        op.open();*/

        //方式三：
        Changhong c=new Changhong();
        OpenAndClose op=new OpenAndClose();
        op.setTv(c);//先set 值
        op.open();  //操作

    }
}


/**
 * 方式一：通过“接口传递”实现依赖
 * 开关接口
 */
/*interface IOpenAndClose{
    public void open(ITv tv);//抽象方法，接收接口
}
interface  ITv{
    public void play();
}
//实现接口
class OpenAndClose implements IOpenAndClose{
    @Override
    public void open(ITv tv) {
        tv.play();
    }
}
class  ChangHong implements ITv{
    @Override
    public void play() {
        System.out.println("=====长虹电视=====");
    }
}*/


/**
 * 方式二：构造器传递 依赖传递
 */

/*interface  IOpenAndClose{
    public void open();//抽象方法
}
interface  ITv{
    public void play();
}
class OpenAndClose implements IOpenAndClose{
    public ITv tv;
    public OpenAndClose(ITv tv){//构造器
        this.tv=tv;
    }
    public void open(){
        this.tv.play();
    }
}
class Changhong implements ITv{
    @Override
    public void play() {
        System.out.println("===打开长虹电视=====");
    }
}*/

/**
 * 方式三：使用setter传递
 */

interface IOpenAndClose{
    public void open();
    public void setTv(ITv tv);
}
interface ITv {
    public void play();
}
class  OpenAndClose implements IOpenAndClose{
    private ITv tv;
    public void open(){
        this.tv.play();
    }
    @Override
    public void setTv(ITv tv) {
        this.tv=tv;
    }
}
class Changhong implements ITv{
    public void play(){
        System.out.println("长虹电视");
    }
}