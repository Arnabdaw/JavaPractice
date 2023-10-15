import java.util.Scanner;
class armstong
{
    static int arm;
    public static void main(String[] args)
    {
        int i,n,rem;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number:");
        n=obj.nextInt();
        i=n;
        while (n>0)
        {
            rem=n%10;
            arm=arm+rem*rem*rem;
            n=n/10;
        }
        if(arm==i)
        {
            System.out.println(i+" is AMSTRONG ");
        }
        else
        {
            System.out.println(i+" is not ARMSTRONG ");
        }
    }
}
