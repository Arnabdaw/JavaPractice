import java.util.Scanner;
class switch_case
{
    public static void main(String[] args)
    {
        int a,b,ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first number:");
        a=obj.nextInt();
        System.out.println("enter the second number:");
        b=obj.nextInt();
        System.out.println("enter yr choice :\n'1' for addition\n'2'for subtraction\n'3'for multiplication\n'4'for division\n");
        ch=obj.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("ADDITION="+(a+b));
                break;
            case 2:
                System.out.println("SUBTRACTION="+(a-b));
                break;
            case 3:
                System.out.println("MULTIPLICATION="+(a*b));
                break;
            case 4:
                System.out.println("DIVISION="+(a/b));
                break;
            default:
                System.out.println("INVALID INPUT!!!");
        }
    }
}
