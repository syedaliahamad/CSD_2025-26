import java.util.Scanner;

public class largest_in_array {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner sc=new  Scanner(System.in);
        int max=0;
        System.out.println("Enter 10 elements in the array");
        for(int i=0;i<10;i++) {
            arr[i] = sc.nextInt();
            if(max<arr[i]) {
                max=arr[i];
            }
        }
        int min=arr[0];
        for(int i=0;i<10;i++) {
            if(arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("The largest number is "+max);
        System.out.println("The smallest number is "+min);
    }
}
