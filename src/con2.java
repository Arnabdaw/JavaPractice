import java.util.Scanner;
class PC
{
    int p,q,r;
    String s;
    PC(int a,int b)
    {
        p=a;
        q=b;
        System.out.println(a+"   "+b);
    }
    PC(int c,String d)
    {
        r=c;
        s=d;
        System.out.println(c+"   "+d);
    }
    void show()
    {
        System.out.println(p+"   "+q+"   "+r+"   "+s);

    }
}
class con2
{
    public static void main(String[] args)
    {
        int x,y,z;
        String str;
        Scanner ref= new Scanner(System.in);
        System.out.println("enter the first number:");
        x=ref.nextInt();
        System.out.println("enter the second number:");
        y=ref.nextInt();
        System.out.println("enter the third number:");
        z=ref.nextInt();
        System.out.println("enter a string:");
        str=ref.next();
        PC obj=new PC(x,y);
        PC obj1=new PC(z,str);
        obj.show();
        obj1.show();
    }
}
