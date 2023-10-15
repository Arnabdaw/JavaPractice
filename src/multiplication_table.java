import java.util.Scanner;
class multiplication_table
{
    public static void main(String[] args)
    {
        int n,i;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number:");
        n=obj.nextInt();
        System.out.println("the multiplication table of "+n+" is:");
        for (i=1;i<=10;i++)
        {
            System.out.println(n+" * " +i+ " = "+n*i);
        }
    }
}
