package com.principal.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * SchoolManager的直接朋友是Employee,CollemeManager
 * 陌生朋友是：CollegeEmployee，  这样违背了迪米特法则，需要修改
 * 因为成员变量，方法参数，方法返回值中的类为直接朋友
 * 改进请查看DemeterAfter
 */
public class DemeterBefore {
    public static void main(String[] args) {
        com.principal.demeter.SchoolManager s=new com.principal.demeter.SchoolManager();
        s.printAllEmployee(new com.principal.demeter.CollemeManager());
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
    public List<com.principal.demeter.CollegeEmployee> getAllEmployee(){
        List<com.principal.demeter.CollegeEmployee> list=new ArrayList<com.principal.demeter.CollegeEmployee>();
        for(int i=0;i<10;i++){//增加10个学院ID
            com.principal.demeter.CollegeEmployee c=new com.principal.demeter.CollegeEmployee();
            c.setId("学院Id:"+i);
            list.add(c);
        }
        return list;
    }
}

/**
 * 学校管理类
 * SchoolManager的直接朋友是Employee,CollemeManager
 * 陌生朋友是：CollegeEmployee，  这样违背了迪米特法则，需要修改
 * 因为成员变量，方法参数，方法返回值中的类为直接朋友
 */
class SchoolManager{
    public List<com.principal.demeter.Employee> getAllEm(){
        List<com.principal.demeter.Employee> list=new ArrayList<com.principal.demeter.Employee>();
        for(int i=0;i<5;i++){
            com.principal.demeter.Employee e=new com.principal.demeter.Employee();
            e.setId("学校Id:"+i);
            list.add(e);
        }
        return list;
    }
    //输出学校和学院的ID
    public void printAllEmployee(com.principal.demeter.CollemeManager cm){
        List<com.principal.demeter.CollegeEmployee> clist=cm.getAllEmployee();
        System.out.println("========学院=======");
        for(com.principal.demeter.CollegeEmployee collegeEmployee:clist){
            System.out.println(collegeEmployee.getId());
        }
        List<com.principal.demeter.Employee> emp=this.getAllEm();
        System.out.println("========学校=====");
        for(com.principal.demeter.Employee e:emp){
            System.out.println(e.getId());
        }

    }
}