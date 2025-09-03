package Exception;

public class Exception {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        String CSD=null;
        try{
            System.out.println(CSD.length());
        }
        catch(java.lang.Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(200/0);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(200/0);
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
        try{
            System.out.println(200/0);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");


    }
}
