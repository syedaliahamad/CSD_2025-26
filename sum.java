public class sum {
    public static void main(String[] args)
    {
        int c=0,s=0;
        for(int i=1;i<=100;i++)
        {
            if(i%2!=0)
            {
                c++;
                s=s+i;
            }
        }
        System.out.println("The sum is "+s);
        System.out.println("the number of odd number between 1-100 :"+ c);
    }
}
