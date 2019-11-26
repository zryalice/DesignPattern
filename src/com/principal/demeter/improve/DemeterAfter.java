package com.principal.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * SchoolManager的直接朋友是Employee,CollemeManager
 * 陌生朋友是：CollegeEmployee，  这样违背了迪米特法则，需要修改
 * 因为成员变量，方法参数，方法返回值中的类为直接朋友
 * 改进请查看DemeterAfter
 */
public class DemeterAfter {
    public static void main(String[] args) {
        SchoolManager s=new SchoolManager();
        s.printAllEmployee(new CollemeManager());
    }
}

//学校总部ID
class Employee{
    private String id;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}

//学院的员工类
class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}

//管理学院员工的管理类
class CollemeManager{
  //获取所有学院员工
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list=new ArrayList<CollegeEmployee>();
        for(int i=0;i<10;i++){//增加10个学院ID
            CollegeEmployee c=new CollegeEmployee();
            c.setId("学院Id:"+i);
            list.add(c);
        }
        return list;
    }
    public void printColloge(){
        List<CollegeEmployee> clist=getAllEmployee();
        System.out.println("========学院=======");
        for(CollegeEmployee collegeEmployee:clist){
            System.out.println(collegeEmployee.getId());
        }
    }


}

/**
 * 学校管理类
 * SchoolManager的直接朋友是Employee,CollemeManager
 * 陌生朋友是：CollegeEmployee，  这样违背了迪米特法则，需要修改
 * 因为成员变量，方法参数，方法返回值中的类为直接朋友
 */
class SchoolManager{
    public List<Employee> getAllEm(){
        List<Employee> list=new ArrayList<Employee>();
        for(int i=0;i<5;i++){
            Employee e=new Employee();
            e.setId("学校Id:"+i);
            list.add(e);
        }
        return list;
    }
    //输出学校和学院的ID
    public void printAllEmployee(CollemeManager cm){

        cm.printColloge(); //调用CollemeManager的printColloge

        List<Employee> emp=this.getAllEm();
        System.out.println("========学校=====");
        for(Employee e:emp){
            System.out.println(e.getId());
        }

    }
}