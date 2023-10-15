import java.util.Scanner;
class FOR
{
    public static void main(String[] args)
    {
        int i,n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number:");
        n= obj.nextInt();
        for (i=n;i>=1;i--)
        {
            System.out.print(i+"  ");
        }
    }
}
