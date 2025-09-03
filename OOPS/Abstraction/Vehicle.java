package OOPS.Abstraction;

abstract public class Vehicle {
    int no_tyre;
    void common(){
        System.out.println("This is common");
    }
    abstract void stop();
    public static void main(String[] args) {
        car c = new car();
        c.no_tyre=10;
        c.stop();   
    }
}
