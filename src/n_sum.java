import java.util.Scanner;
class n_sum
{
    static int sum;
    public static void main(String[] args)
    {
        int i,n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of terms:");
        n= obj.nextInt();
        for (i=1;i<=n;i++)
        {
            sum = sum + i;
        }
        System.out.print("ADDITION OF "+n+" NUMBERS="+sum);
    }
}
