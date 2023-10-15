import java.util.Scanner;
class odd
{
    public static void main(String[] args)
    {
        int i,n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the upper limit:");
        n= obj.nextInt();
        System.out.println("odd numbers are:");
        for (i=1;i<=n;i++)
        {
            if(i%2==1)
            {
                System.out.print(i+" ");
            }
        }
    }
}