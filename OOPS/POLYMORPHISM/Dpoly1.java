package OOPS.POLYMORPHISM;

import java.util.Scanner;
class a1{
    void m1(){
        System.out.println("coming from m1 method");
    }
}
class b1 extends a1{
    void m1(){
        System.out.println("coming from m2 method");
    }
}
public class Dpoly1 {
    public static  void main(String args[]){
        a1 a1=new b1();
       a1.m1();
    }
}
