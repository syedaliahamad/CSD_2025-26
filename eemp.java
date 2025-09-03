import java.util.Scanner;

public class eemp {
    String name;
    double salary;
    eemp(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    void show(){
        System.out.println("Name: "+name+" Salary: "+salary);
    }
}
class Manager extends eemp{
    String dept;
    Manager(String name,double salary,String dept){
        super(name,salary);
        this.dept=dept;
    }
    void show(){
        super.show();
        System.out.println("Dept: "+dept);
    }
}

