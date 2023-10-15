import java.util.Scanner;
class sum_digit
{
    static int sum;
    public static void main(String[] args)
    {
        int n,i,rem;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter any number:");
        n = obj.nextInt();
        i=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("SUM  OF  ALL  DIGITS OF "+i+" is : "+sum);
    }
}

