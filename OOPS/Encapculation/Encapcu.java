package OOPS.Encapculation;

import java.lang.reflect.Field;

class employee{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>0){
            this.salary = salary;
            System.out.println(salary);
        }
        else
            {
            System.out.println("Invalid amount");
            }
    }

    private double salary=1000;
     private String name;

}
public class Encapcu {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        System.out.println("Hello World");
        employee e1=new employee();
//        Field fsalary= employee.class.getDeclaredField("salary");
//        fsalary.setAccessible(true);
//        System.out.println(fsalary.get(e1));
       e1.setSalary(4000);
        System.out.println(e1.getSalary());
    }
}
