import java.util.Scanner;
class fibonacci
{
    public static void main(String[] args)
    {
        int i,a=0,b=1,c,term;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of terms:");
        term=obj.nextInt();
        for(i=1;i<=term;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
