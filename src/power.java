import java.util.Scanner;
class power
{
    public static void main(String[] args)
    {
        int i,n,p,sum=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number:");
        n=obj.nextInt();
        System.out.println("enter the power:");
        p=obj.nextInt();
        for(i=1;i<=p;i++)
        {
            sum=sum*n;
        }
        System.out.println("the result is:"+sum);
    }
}