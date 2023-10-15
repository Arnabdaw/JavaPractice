import java.util.Scanner;
class relational
{
    public static void main(String[] args)
    {
        int a,b,c,d;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first number:");
        a=obj.nextInt();
        System.out.println("enter the second number:");
        b=obj.nextInt();
        System.out.println("enter the third number:");
        c=obj.nextInt();
        System.out.println("enter the forth number:");
        d=obj.nextInt();
        System.out.println("LOGICAL AND");
        System.out.println((a>b)&&(c>d));
        System.out.println((a>b)&&(c<d));
        System.out.println((a<b)&&(c<d));
        System.out.println((a<b)&&(c>d));
        System.out.println("LOGICAL OR");
        System.out.println((a>b)||(c>d));
        System.out.println((a>b)||(c<d));
        System.out.println((a<b)||(c<d));
        System.out.println((a<b)||(c>d));
        System.out.println("LOGICAL NOT");
        System.out.println(!(a>b));
        System.out.println(!(a<b));
        System.out.println(!(c>d));
        System.out.println(!(c<d));
    }
}
