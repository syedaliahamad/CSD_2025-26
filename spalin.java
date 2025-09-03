import java.util.Scanner;

public class spalin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss="";
        int flag=1;
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("the number of char are:"+s.length());
        for(int i=s.length()-1;i>=0;i--){
            ss+=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=ss.charAt(i)){
                flag=0;
            }
        }
        if(flag==1){
            System.out.println("the string is palindrome");

        }
        else{
            System.out.println("the string is not palindrome");
        }
    }
}
