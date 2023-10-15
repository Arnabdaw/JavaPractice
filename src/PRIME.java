import java.util.Scanner;
class PRIME
{
    static int temp;
    public static void main(String[] args)
    {
        int i,n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number:");
        n=obj.nextInt();
        if(n==1)
        {
            temp++;
        }
        else
        {
            for (i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    temp++;
                    break;
                }
            }
        }
        if(temp==1)
        {
            System.out.println("NOT PRIME");
        }
        else
        {
            System.out.println("PRIME");
        }
    }
}
