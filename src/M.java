import java.util.Scanner;
class M
{
    public static void main(String[] args)
    {
        M obj=new M();
        obj.disp();
        M.add();
    }
    void disp()
    {
        System.out.println("I AM THE BEST CODER OF THE WORLD");
    }
    public static void add()
    {
        Scanner obj=new Scanner(System.in);
        int a,b,sum;
        System.out.println("enter the first number :");
        a=obj.nextInt();
        System.out.println("enter the second number:");
        b=obj.nextInt();
        sum=a+b;
        System.out.println("SUM = "+sum);
    }
}
