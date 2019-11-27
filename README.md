# DesignPattern
20191125
  设计模式七大原则 
   
    1：单一原则
        案例：
        交通工具：汽车、摩托车、轮船、飞机   
        前提在类中方法数量足够少，如果方法太多，则需要按类进行遵守单一原则
     
    2：接口隔离原则 
        即一个类对另一个在的依赖应该建立在了小的接口上.就是拆分接口
        案例：
          
        
    3:依赖反转
        有3种方式：接口传递、构造器传递、setter传递
        
    4:里氏替换
        使用继承时，遵循里氏替换原则 ，在子类中尽量不要重写父类方法
        案例： 
          B类重写了A类的fun1 ,加减运算

    5:开闭原则 
        案例：画图形、三角形、圆形、长方形， 新加功能时，尽量不要多写代码，做到可扩展性
        
    6:迪米特法则
        不要把自己的实现写到别的类中
    7：合成复用
    
# DesignPattern
20191127
 设计模式
      一、单例模式分8种:
              饿汉式(浪费内存，线程不安全
              懒汉式(同步代码块，线程安全,效率低
              双重检查、静态内部类、枚举
              推荐使用：
                双重检查、静态内部类、枚举
      二、简单工厂模式
          SimpleFactory
      
