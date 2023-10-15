import java.util.Scanner;
class sum_odd_even
{
    public static void main(String[] args)
    {
        int i,n,odd=0,even=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the upper limit:");
        n= obj.nextInt();
        for (i=1;i<=n;i++)
        {
            if (i % 2 == 1)
            {
                odd = odd + i;
            }
            else
            {
                even = even + i;
            }
        }
            System.out.println("the sum of odd numbers are:"+odd);
            System.out.println("the sum of even numbers are:"+even);
    }
}