import java.util.Scanner;

class Employee
{
    int nEmp;
    String sName;
    long nSal;
    void mcalcIncomeTax(long nSal)
    {
        System.out.println("return income tax");
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee e1= new Employee();

        e1.nEmp=1234;
        e1.nEmp=sc.nextInt();
        e1.sName="Abhishek";
        Employee e2= new Employee();
        e2.nEmp=5678;
        e2.sName="shubhankar";

        e1.mcalcIncomeTax(12345);
        System.out.println("e1 employee id is "+e1.nEmp);
        System.out.println("e1 employee name is "+e1.sName);
    }
}