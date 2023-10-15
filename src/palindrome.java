import java.util.Scanner;
class palindrome
{
    static int rev;
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
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==i)
        {
            System.out.println(i+" is PALINDROME ");
        }
        else
        {
            System.out.println(i+" is not PALINDROME ");
        }
    }
}

