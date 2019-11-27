package com.code.factory.simplefactory.pizza;

/**
 * 披萨的属性， 烤， 切，打包
 */
public abstract class Pizza {
    protected String name;
    public abstract void prepare();
    //烤
    public void bake(){
        System.out.println(name+" baking");
    }
    //切割
    public void cut(){
        System.out.println(name+" cuting ");
    }
    //打包
    public void box(){
        System.out.println(name+" boxing ");
    }
    //设置披萨名称
    public void setName(String name){
        this.name=name;
    }
}
