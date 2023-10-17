import java.util.Scanner;
class fact_r
{
    public static void main(String[] args)
    {
        int ans,a;
        Scanner obj= new Scanner(System.in);
        System.out.println("enter a  positive number:");
        a=obj.nextInt();
        fact_r ref=new fact_r();
        ans=ref.fact(a);
        System.out.println("factorial of "+a+" is "+ans);
    }
    int fact(int b)
    {
        if (b>0)
        {
            return (b*fact(b-1));
        }
        else
        {
            return 1;
        }
    }
}
