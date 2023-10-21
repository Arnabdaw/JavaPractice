import java.util.Scanner;
class over
{
    Scanner obj = new Scanner(System.in);
    int a;
    double b;
    String c;
    over()
    {
        System.out.println("enter a number:");
        a = obj.nextInt();
        System.out.println("enter a fractional number:");
        b = obj.nextDouble();
        System.out.println("enter a name:");
        c = obj.next();
    }
    over(int x)
    {
        a = x;
    }
    over(double y, String z)
    {
        b = y;
        c = z;
    }
}
class con5
{
    public static void main(String[] args)
    {
        over r1=new over();
        over r2=new over(100);
        over r3=new over(15.26,"ARNAB");
        System.out.println(r1.a+"   "+r1.b+"   "+r1.c);
        System.out.println(r2.a);
        System.out.println(r3.b+"   "+r3.c);
    }
}
