import java.util.Scanner;
class Harshad
{
    int a,b,add,sub,multi,div,rem;
    public static void main(String[] args)
    {
        fun obj=new fun();
        obj.input();
        obj.process();
        obj.output();
    }
    void input()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first number:");
        a=obj.nextInt();
        System.out.println("enter the second number:");
        b=obj.nextInt();
    }
    void process()
    {
        add=a+b;
        sub=a-b;
        multi=a*b;
        div=a/b;
        rem=a%b;
    }
    void output()
    {
        System.out.println("sum="+add);
        System.out.println("sub="+sub);
        System.out.println("multi="+multi);
        System.out.println("division="+div);
        System.out.println("rem="+rem);
    }
}
