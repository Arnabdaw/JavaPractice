import java.util.Scanner;
class nested
{
    public static void main(String[] args)
    {
        int a,b,c,max;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first number:");
        a=obj.nextInt();
        System.out.println("enter the second number:");
        b=obj.nextInt();
        System.out.println("enter the third number:");
        c=obj.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                max=a;
                System.out.println("MAXIMUM="+max);
            }
            else
            {
                max=c;
                System.out.println("MAXIMUM="+max);
            }
        }
        else
        {
            if(b>c)
            {
                max=b;
                System.out.println("MAXIMUM="+max);
            }
            else
            {
                max=c;
                System.out.println("MAXIMUM="+max);
            }
        }
    }
}
