import java.util.Scanner;
class perfect
{
    static int sum;
    public static void main(String[] args)
    {
        int i,n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number:");
        n=obj.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.println(n+ " is PERFECT NUMBER ");
        }
        else
        {
            System.out.println(n+" is NOT PERFECT NUMBER ");
        }
    }
}
