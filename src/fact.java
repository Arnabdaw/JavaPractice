import java.util.Scanner;
class fact
{
    public static void main(String[] args)
    {
        int i,n,fact=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number:");
        n=obj.nextInt();
        if(n!=0)
        {
            for(i=1;i<=n;i++)
            {
                fact=fact*i;
            }
        }
        System.out.println("the factorial value of "+n+" is "+fact);
    }
}
