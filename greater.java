import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            if(a>c)
            {
                System.out.println("the greater number is "+a);
            }
            else
            {
                System.out.println("the greater number is "+c);
            }
        }
        else if (b > a) {
            if(b>c)
            {
                System.out.println("the greater number is "+b);
            }
            else
            {
                System.out.println("the greater number is "+c);
            }
        }
    }
}
