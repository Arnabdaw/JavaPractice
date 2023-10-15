import java.util.Scanner;
class factor
{
    public static void main(String[] args)
    {
        int i,n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number:");
        n=obj.nextInt();
        for (i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+"  ");
            }
        }
    }
}
