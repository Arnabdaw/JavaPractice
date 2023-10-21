import java.util.Scanner;
class con4
{
    int a;
    double b;
    String c;
    Scanner obj=new Scanner(System.in);
    private con4()
    {
        System.out.println("enter a number:");
        a=obj.nextInt();
        System.out.println("enter a fractional number:");
        b=obj.nextDouble();
        System.out.println("enter a name:");
        c=obj.next();
        System.out.println(a+"   "+b+"   "+c);
    }
    void show()
    {
        System.out.println(a+"   "+b+"   "+c);
    }

    public static void main(String[] args)
    {
        con4 r=new con4();
        r.show();
    }
}

