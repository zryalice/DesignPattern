package ocp;

/**
 * 开闭原则
 * 需求：新增加矩形， 那么就需要再新写一个矩形的class,再写一个draw，再写if else，代码改造有点多， 需要精简，可扩展性， 需要改进，则看ocpafter
 */
public class Ocpbefore {
    public static void main(String[] args) {
        GraphicEditor g=new GraphicEditor();
        g.drawCircle(new ocp.Shape());
        g.drawTriangle(new ocp.Shape());
    }
}

//基类   形状
class Shape{
    int type;
}
//三角形
class Triangle extends ocp.Shape {
    public Triangle(){
        super.type=1;
    }
}
//圆形
class Circle extends ocp.Shape {
    public Circle(){
        this.type=2;
    }
}


//使用方
class GraphicEditor{
    public void draw(ocp.Shape s){
        if(s.type==1){
            drawTriangle(s);
        }else if(s.type==2){
            drawCircle(s);
        }
    }
    public void drawTriangle(ocp.Shape s){
        System.out.println("绘制三角形");
    }
    public void drawCircle(ocp.Shape s){
        System.out.println("绘制圆形");
    }
}