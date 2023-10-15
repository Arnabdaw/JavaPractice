import java.util.Scanner;
class prime_range
{
    public static void main(String[] args)
    {
        int i, j, n1, n2;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the lower limit:");
        n1 = obj.nextInt();
        System.out.println("enter the upper limit:");
        n2 = obj.nextInt();
        if(n1<=2)
        {
            System.out.print("2 ");
        }
        for (i = n1; i <= n2; i++)
        {
            for (j = 2; j <i; j++)
            {
                if (i % j == 0)
                    break;
                if (j==i-1)
                    System.out.print(i + " ");
            }
        }
    }
}
