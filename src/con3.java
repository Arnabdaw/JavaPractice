import java.util.Scanner;
class CC
{
    int a;String b;
    CC()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number:");
        a=obj.nextInt();
        System.out.println("enter a name:");
        b=obj.next();
        System.out.println(a+"   "+b);
    }
    CC(CC ref)
    {
        System.out.println(a+"   "+b);
        a=ref.a;
        b=ref.b;
        System.out.println(a+"   "+b);
    }
}
class con3
{
    public static void main(String[] args)
    {
        CC r1=new CC();
        CC r2=new CC(r1);
    }
}
