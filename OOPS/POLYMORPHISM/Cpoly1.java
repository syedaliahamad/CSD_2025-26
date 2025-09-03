package OOPS.POLYMORPHISM;
// static or early binding
public class Cpoly1 {
    Cpoly1(){
        System.out.println("hello");
    }
    Cpoly1(int nEmp){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        System.out.println("A");
        Cpoly1 c1=new Cpoly1();
        c1.m1();
    }
    public static void main() {
        System.out.println("t");

    }
    void m1(int a){
        System.out.println("B");
    }
    void m1(){
        System.out.println("C");
    }
    void m1(int a,String b){
        System.out.println("D");
    }
    void m1(String a,int b)
    {
        System.out.println("E");
    }
}
