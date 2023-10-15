import java.util.Scanner;
class reverse
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
        System.out.println("REVERSE OF "+i+" is : "+rev);
    }
}
