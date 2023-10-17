import java.util.Scanner;
public class R
{
    public static void main(String[] args)
    {
        int a,ans;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any natural number:");
        a=obj.nextInt();
        R ref=new R();
        ans=ref.sum(a);
        System.out.println("the sum of first "+a+" natural number is "+ans);
    }
    int sum(int b)
    {
        if(b>0)
        {
            return (b+sum(b-1));
        }
        else
        {
            return 0;
        }
    }
}
