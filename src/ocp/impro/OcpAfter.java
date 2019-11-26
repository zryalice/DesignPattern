package ocp.impro;

/**
 * 改进后的， 至少if else , 不用再写了。
 * 这就是使用了开闭原则，尽量不修改代码，或少写代码
 */
public class OcpAfter {
    public static void main(String[] args) {
        GraphicEditor g=new GraphicEditor();
        g.draw(new Circle());
        g.draw(new Triangle());
        g.draw(new Rectangle());
    }
}
abstract class Shape{
    int type;
    public abstract void draw();//r抽象 方法draw
}
class Triangle extends  Shape{
    public Triangle(){
        this.type=1;
    }
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
class Circle extends  Shape{
    public Circle(){
        this.type=2;
    }
    public void draw() {
        System.out.println("绘制圆形");
    }
}

//新增加一个矩形
class Rectangle extends Shape{
    public Rectangle(){
        this.type=3;
    }
    public void draw() {
        System.out.println("绘制长方形");
    }
}
//使用方
class GraphicEditor {
    public void draw(Shape s){
        s.draw();
    }
}
