import java.util.Scanner;
class swap
{
    public static void main(String[] args)
    {
        int a,b,temp;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter first number:");
        a=obj.nextInt();
        System.out.println("enter second number:");
        b=obj.nextInt();
        System.out.println("BEFORE SWAPPING "+a+"    "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("AFTER SWAPPING "+a+"    "+b);
    }
}